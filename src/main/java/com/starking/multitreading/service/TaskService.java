package com.starking.multitreading.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author pedroRhamon
 */

@Service
public class TaskService {

	@Async
	public void executeTask() {
		System.out.println("Task execution started in thread: " + Thread.currentThread().getName());

		// Simulating a long-running task
		try {
			Thread.sleep(5000); // 5 seconds delay
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IllegalStateException(e);
		}

		System.out.println("Task execution completed in thread: " + Thread.currentThread().getName());
	}

}
