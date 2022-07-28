package com.dibasb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	void testAdd() {

		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");
	}

	@Test
	void testDivide() {

		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");
	}

	@Test
	void testComputeCircleRadius() {
		assertEquals(314.159265358979323846, mathUtils.computeCircleArea(10), "Should return right circle area");

	}

}
