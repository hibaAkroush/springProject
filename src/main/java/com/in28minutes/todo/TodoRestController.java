package com.in28minutes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.model.Todo;
import com.in28minutes.todo.service.TodoService;

@RestController
public class TodoRestController {
	@Autowired
	TodoService service;
	
	@RequestMapping(path="/todos")
	public  java.util.List<Todo> retrieveAllTodos(){
		return service.retrieveTodos("hiba");
		
	}
	@RequestMapping(path="/todos/{id}")
	public  Todo retrieveTodo(@PathVariable int id){
		return service.retrieveTodo(id);
		
	}	
}
