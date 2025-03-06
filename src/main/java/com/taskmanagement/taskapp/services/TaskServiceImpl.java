package com.taskmanagement.taskapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.taskapp.dao.TaskDao;
import com.taskmanagement.taskapp.model.Task;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;
	
	@Override
	public Task addTask(Task task) {
		// TODO Auto-generated method stub
		taskDao.save(task);
		return task;
	}

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		   return taskDao.findAll();
	}
	
	@Override
	public Task updateTask(Long id, Task updatedTask) {
	    return taskDao.findById(id).map(task -> {
	        task.setName(updatedTask.getName());
	        task.setDesc(updatedTask.getDesc());
	        task.setStatus(updatedTask.getStatus());
	        task.setDate(updatedTask.getDate());
	        task.setTitle(updatedTask.getTitle());
	        return taskDao.save(task);
	    }).orElseThrow(() -> new RuntimeException("Task not found"));
	}
	
	
	 @Override
	 public void deleteTask(Long id) {
	     Task task = taskDao.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
	     task.setStatus("old");
	     taskDao.save(task);
	 }
}
