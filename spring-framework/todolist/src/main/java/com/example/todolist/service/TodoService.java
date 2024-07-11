package com.example.todolist.service;

import com.example.todolist.config.AppConfig;
import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  private AppConfig appConfig = new AppConfig();

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getAllTodo() {
    appConfig.enviarWhatsapp();
    List<Todo> listTodo = todoRepository.findAll();
    return listTodo;
  }

  public List<Todo> createTodo(Todo todo) {
    appConfig.enviarWhatsapp();
    todoRepository.save(todo);
    return getAllTodo();
  }

  public List<Todo> updateTodo(Todo todo) {
    appConfig.enviarWhatsapp();
    todoRepository.save(todo);
    return getAllTodo();
  }

  public List<Todo> deleteTodo(Long id) {
    appConfig.enviarWhatsapp();
    todoRepository.deleteById(id);
    return getAllTodo();
  }

}
