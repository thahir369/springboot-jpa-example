package com.helloworld.service;

import com.helloworld.entity.Todo;

import java.util.List;

public interface TodoService {


  List<Todo> getAllTodos();

  Todo getTodoById(Integer id) throws Exception;

  String createTodo(Todo todo);

  Todo updateTodo(Integer id, Todo todo) throws Exception;

  String deleteTodoById(Integer id);

}
