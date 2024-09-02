package com.starking.multitreading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starking.multitreading.service.TaskService;

import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */
@RequestMapping("/api/tasks")
@RestController
@AllArgsConstructor
public class TaskController {

	private final TaskService taskService;

	@GetMapping("/process")
	public String processTask() {
		taskService.executeTask();
		return "Task is being processed in the background!";
	}
}
