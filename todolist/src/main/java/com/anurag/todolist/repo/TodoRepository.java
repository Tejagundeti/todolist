package com.anurag.todolist.repo;

import org.springframework.data.repository.CrudRepository;

import com.anurag.todolist.entity.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
