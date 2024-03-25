package com.helloworld.service;


import com.helloworld.entity.Todo;
import com.helloworld.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

  private final TodoRepository todoRepository;

  @Override
  public List<Todo> getAllTodos() {
    return todoRepository.findAll();
  }

  @Override
  public Todo getTodoById(Integer id) throws Exception {
    Optional<Todo> optionalTodo = todoRepository.findById(id);
    if (optionalTodo.isPresent()) {
      return optionalTodo.get();
    } else {
      throw new Exception("Todo with id " + id + " is not found");
    }
  }

  @Override
  public String createTodo(Todo todo) {
    todoRepository.save(todo);
    return "todo added successfully";
  }

  @Override
  public Todo updateTodo(Integer id, Todo todo) throws Exception {
    Optional<Todo> todoOptional = todoRepository.findById(id);
    if (todoOptional.isPresent()) {
      todo.setId(id);
      return todoRepository.save(todo);
    } else {
      throw new Exception("Todo with id " + id + " is not found");
    }
  }

  @Override
  public String deleteTodoById(Integer id) {
    todoRepository.deleteById(id);
    return "todo with id: " + id + " deleted successfully";
  }
}
