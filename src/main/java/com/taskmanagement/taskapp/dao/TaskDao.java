package com.taskmanagement.taskapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanagement.taskapp.model.Task;

public interface TaskDao extends JpaRepository<Task, Long> {

}
