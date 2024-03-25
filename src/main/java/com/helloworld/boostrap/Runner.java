package com.helloworld.boostrap;

import com.helloworld.entity.Todo;
import com.helloworld.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

  private final TodoRepository todoRepository;

  @Override
  public void run(String... args) throws Exception {

    todoRepository.save(Todo.builder().id(1).description("learn java").status("in progress").build());
    todoRepository.save(Todo.builder().id(2).description("learn aws").status("completed").build());
    todoRepository.save(Todo.builder().id(3).description("learn azure").status("in progress").build());


  }
}
