package com.example.todolist.service;

import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  private TodoRepository todoRepository;



  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getAllTodo() {
    List<Todo> listTodo = todoRepository.findAll();
    return listTodo;
  }

  public List<Todo> createTodo(Todo todo) {
    todoRepository.save(todo);
    return getAllTodo();
  }

  public List<Todo> updateTodo(Todo todo) {
    todoRepository.save(todo);
    return getAllTodo();
  }

  public List<Todo> deleteTodo(Long id) {
    todoRepository.deleteById(id);
    return getAllTodo();
  }

}
