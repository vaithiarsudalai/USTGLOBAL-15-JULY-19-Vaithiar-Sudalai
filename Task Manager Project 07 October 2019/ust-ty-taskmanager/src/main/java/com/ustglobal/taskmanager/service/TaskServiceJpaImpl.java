package com.ustglobal.taskmanager.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.taskmanager.dto.Task;
import com.ustglobal.taskmanager.repository.TaskRepository;

@Service
public class TaskServiceJpaImpl implements TaskService {

	@Autowired
	TaskRepository repository;
	
	@Override
	public boolean addTask(Task task) {
		Date startDate = new Date(); 
		task.setStartDate(startDate);
		repository.save(task);
		return true;
	}

	@Override
	public boolean deleteTask(int taskId) {
		repository.deleteById(taskId); 
		return true;
	}

	@Override
	public boolean updateTask(Task task) {
		Date endDate =new Date();
		repository.update(endDate, task.getTaskId());
		return true;
	}

	@Override
	public List<Task> getAllTask() {
		return repository.findAll();
	}

}
