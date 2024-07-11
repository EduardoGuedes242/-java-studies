package com.example.todolist.controller;

import com.example.todolist.entity.Todo;
import com.example.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping
  public List<Todo> getAll() {
    return todoService.getAllTodo();
  }

  @PostMapping
  public List<Todo> create(@RequestBody Todo todo) {
    return todoService.createTodo(todo);
  }

  @PutMapping
  public List<Todo> update(@RequestBody Todo todo) {

    return todoService.updateTodo(todo);
  }

  @DeleteMapping("{id}")
  public List<Todo> delete(@PathVariable("id") Long id) {
    return todoService.deleteTodo(id);
  }
}
