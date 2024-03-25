package com.helloworld.controller;

import com.helloworld.entity.Todo;
import com.helloworld.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

  private final TodoService todoService;

  @GetMapping("/home")
  public String home() {
    return "welcome to homepage";
  }

  @GetMapping("/todos")
  public List<Todo> getAllTodos() {
    return todoService.getAllTodos();
  }

  @GetMapping("/todos/{id}")
  public Todo getTodoById(@PathVariable Integer id) throws Exception {
    return todoService.getTodoById(id);
  }

  @PostMapping("/todos")
  public String createTodo(@RequestBody Todo todo) {
    return todoService.createTodo(todo);
  }


  @PutMapping("/todos/{id}")
  public Todo updateTodo(@PathVariable Integer id, @RequestBody Todo todo) throws Exception {
    return todoService.updateTodo(id, todo);
  }

  @DeleteMapping("/todos/{id}")
  public String deleteTodoById(@PathVariable Integer id) {
    return todoService.deleteTodoById(id);
  }


}
