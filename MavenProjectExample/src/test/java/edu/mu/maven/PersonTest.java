package edu.mu.maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person person = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		person = new Person("Ekin", 10, false);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		assertEquals("Ekin", person.getName());
	}

}
