//Trebao bi se paket zvati kao ovaj zakomentirani
//package com.in28minutes.todo.rest
package com.in28minutes.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TodoRestController {
	@Autowired
	private TodoService service;

	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public List<Todo> listAllTodos() {
		List<Todo> users = service.retrieveTodos("in28Minutes");
		return users;
	}
	
	@RequestMapping(value = "/todos/{id}")
	public Todo retreiveTodo(@PathVariable int id) {
		return service.retrieveTodo(id);
		
	}

}
