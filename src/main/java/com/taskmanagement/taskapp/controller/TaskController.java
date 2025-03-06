package com.taskmanagement.taskapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.taskapp.dao.TaskDao;
import com.taskmanagement.taskapp.model.Task;
import com.taskmanagement.taskapp.services.TaskService;

@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@Autowired
	private TaskDao taskDao;

	
	@PostMapping
	public Task addTask(@RequestBody Task task) {
		
		return this.taskService.addTask(task);
	}
	
	
	@GetMapping
	public List<Task> getAllTasks() {
	    return taskService.getAllTasks();
	}
	
	
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
	    return taskService.updateTask(id, updatedTask);
	}

	@DeleteMapping("/{id}")
	public Task deleteTask(@PathVariable Long id) {
	    taskService.deleteTask(id);
	    return taskDao.findById(id).orElseThrow(() -> new RuntimeException("Task not updated to old"));
	}

}
