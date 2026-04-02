package edu.mu.cs3330.task;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TaskManagerTest {
	
	private static TaskManager manager = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		manager = new TaskManager();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	private static Stream<Arguments> taskCompletionCases() {
		return Stream.of(
				Arguments.of(1, true),
				Arguments.of(1, false)
				);
	}
	
	@ParameterizedTest
	@MethodSource("taskCompletionCases")
	void testCompleteTask(int taskID, boolean expectedOutput) {
		manager.newTask("Walk the dog");
		manager.newTask("Do homework");
		assertEquals(manager.completeTask(taskID), expectedOutput);
	}

}
