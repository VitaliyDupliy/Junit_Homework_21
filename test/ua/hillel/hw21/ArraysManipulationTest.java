package ua.hillel.hw21;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class ArraysManipulationTest {

	@Test
	void ArrayAfter4Test() {
		assertArrayEquals(new int[] {5, 1, 23, 56, 7, 1, 2}
		, ArraysManipulation.arrayAfter4(new int [] {5,8,4,2,4,5,1,23,56,7,1,2}));
	}
	
	@Test
	void ArrayAfter4Test2() {
		assertArrayEquals(new int[] {5,8,2,5,1,23,56,7,1,2}
		, ArraysManipulation.arrayAfter4(new int [] {4,5,8,2,5,1,23,56,7,1,2}));
	}
	
	@Test
	void ArrayAfter4Test3() {
		assertArrayEquals(new int[] {}
		, ArraysManipulation.arrayAfter4(new int [] {4}));
	}
	
	@Test
	void ArrayAfter4ExceptionTest1() {
		assertThrows(RuntimeException.class, () -> {
			ArraysManipulation.arrayAfter4(new int [] {});
		});
	}

	@Test
	void ArrayAfter4ExceptionTest2() {
		assertThrows(RuntimeException.class, ()-> {ArraysManipulation.arrayAfter4(new int [] {1,2,3,5});
			
		});
	}
	
	
	
	
	@Test
	void Check4And1_Test_ok() {
		assertTrue(ArraysManipulation.check4And1(new int[] {1,1,4,1,1,4,4,4}));
	}
	
	@Test
	void Check4And1_Test_4_absent() {
		assertFalse(ArraysManipulation.check4And1(new int[] {1,1,1,1}));
	}
	
	@Test
	void Check4And1_Test_1_absent() {
		assertFalse(ArraysManipulation.check4And1(new int[] {4,2,4,4}));
	}

}
