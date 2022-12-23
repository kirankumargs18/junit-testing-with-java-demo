package com.kirangs;

/**
 * 
 * */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

	private List<String> strings;

	/**
	 * @BeforeClass must be public, static
	 */
	@BeforeClass
	public static void method1() {

		System.out.println("@BeforeClass : executed before all test cases");
	}

	@Before
	public void method2() {

		strings = new ArrayList<>();
		System.out.println("@Before : executed before each test case");
	}

	/**
	 * @AfterClass must be static, public
	 */
	@AfterClass
	public static void method3() {
		System.out.println("@AfterClass : executed after all test cases");
	}

	@After
	public void method4() {

		System.out.println("@After : executed after each test case");
	}

	/**
	 * test case : 1
	 */
	@Test
	public void method5() {

		System.out.println("This is a test case");
		strings.add("name");
		assertFalse(strings.isEmpty());
		assertEquals("name", strings.get(0));

	}

}
