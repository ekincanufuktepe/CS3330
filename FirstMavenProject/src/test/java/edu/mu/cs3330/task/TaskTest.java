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


class TaskTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	private static Stream<Arguments> taskCases() {
		return Stream.of(
				Arguments.of(new Task("Do homework"), "Do homework"),
				Arguments.of(new Task(""), "")
				);
	}
	
	@ParameterizedTest
	@MethodSource("taskCases")
	public void testGetDescription(Task task, String expectedOutput) {
		assertEquals(task.getDescription(), expectedOutput);
	}

}
