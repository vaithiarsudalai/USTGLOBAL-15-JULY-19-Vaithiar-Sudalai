package com.ustglobal.taskmanager.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.taskmanager.dto.Task;
import com.ustglobal.taskmanager.dto.TaskResponse;
import com.ustglobal.taskmanager.service.TaskService;


@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*")
public class TaskController {

	@Autowired
	private TaskService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addTask(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if (service.addTask(task)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task added Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task added Unsuccessfully");
		}
		return response;
	}

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getAllTask() {
		List<Task> taskList = service.getAllTask();
		TaskResponse response = new TaskResponse();
		if (taskList.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employees Not Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Found");
			response.setTaskList(taskList);
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse removeEmployee(@PathVariable("id") int taskId) {
		TaskResponse response = new TaskResponse();
		if (service.deleteTask(taskId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task Deleted Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task Deleted Unsuccessfully");
		}
		return response;

	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse modifyEmployee(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if (service.updateTask(task)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task completed Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task Not Completed");
		}
		return response;
	}

}
