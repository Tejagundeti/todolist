package com.anurag.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anurag.todolist.entity.Todo;
import com.anurag.todolist.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoservice;
	
	@PostMapping("/todos")
	@ResponseBody
	public Todo createTodo (@RequestBody Todo todo)
	{
		return todoservice.createTodo(todo);
	}
	
	@PutMapping("/todos/{id}")
	@ResponseBody
	public Todo update(@PathVariable long id,@RequestBody Todo todo) {
		return todoservice.update(id,todo);
	}

@GetMapping("/todos")
@ResponseBody
public list<Todo> getAllTodos(){
	return todoservice.getAllTodos();
	}
}