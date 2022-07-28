package com.dibasb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeALlInit()
	{
		System.out.println("execution of @beforeAll method()");
	}

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up...");
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
