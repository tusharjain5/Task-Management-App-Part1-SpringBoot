package com.taskmanagement.taskapp.services;

import java.util.List;

import com.taskmanagement.taskapp.model.Task;

public interface TaskService {

	public Task addTask(Task task);
	public List<Task> getAllTasks();
	public  Task updateTask(Long id, Task task);
	public void deleteTask(Long id);
}
