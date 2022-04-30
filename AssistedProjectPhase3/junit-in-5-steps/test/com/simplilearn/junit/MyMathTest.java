package com.simplilearn.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	// MyMath.sum
	// 1,2,3 => 6
	MyMath math = new MyMath();
	
//	@Before
//	public void before() {
//		System.out.println("Before");
//	}
	
//	@After
//	public void after() {
//		System.out.println("After");
//	}
	
//	@BeforeClass
//	public static void beforeClass() {
//		System.out.println("Before class");
//	}
	
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("After class");
//	}

	@Test
	public void sum_with3numbers() {
		// Absence of failure is success

		int result = math.sum(new int[] { 1, 2, 3 });
		System.out.println(result);
		assertEquals(6, result);
	}

}
