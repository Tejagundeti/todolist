package com.anurag.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.todolist.controller.list;
import com.anurag.todolist.entity.Todo;
import com.anurag.todolist.repo.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todorepository;
	public Todo createTodo(Todo todo)
	{
		todorepository.save(todo);
		
		return todo;
	}
	public Todo update(long id, Todo todo) {
		if(todorepository.existsById(id))
		{
			todo.setId(id);
			todorepository.save(todo);
			return todo;
		}
		else
		{
			return null;
		}
	}
	public list<Todo> getAllTodos() {
		return(list<Todo>) todoservice.getAllTodos();
		return null;
	}
}
