package ua.hillel.hw21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathLibraryTest {

	@Test
	void addPositiveTest() {
		assertEquals(5.0, SimpleMathLibrary.add(2.5,2.5));
	}
	
	@Test
	void addNegativeTest() {
		assertEquals(0.0, SimpleMathLibrary.add(-2.5,2.5));
	}
	
	@Test
	void minusPositiveTest() {
		assertEquals(2.5, SimpleMathLibrary.minus(5,2.5));
	}
	
	@Test
	void minusNegativeTest() {
		assertEquals(7.5, SimpleMathLibrary.minus(5,-2.5));
	}

}
