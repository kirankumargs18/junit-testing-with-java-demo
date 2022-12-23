package com.kirangs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestClass {
	
	private List<Integer> intArrayList;
	
	@Before
	public void beforeEachTestCase() {
		
		intArrayList=new ArrayList<>();
		
//		intArrayList.add(10);
//		intArrayList.add(20);
//		intArrayList.add(30);
//		intArrayList.add(40);
//		intArrayList.add(50);
		
		intArrayList.addAll(Arrays.asList(10,20,30,40,50));
	}
	
	@After
	public void afterEachTestCase() {
		
		System.out.println("test case executed successfully");
	}
	
	@Test
	public void testAddElementToArrayList() {
		
		assertTrue(intArrayList.add(60));
		assertEquals(true, intArrayList.add(70));
		assertEquals(7, intArrayList.size());
	}
	
	
	@Test
	public void testRemoveElementFromArrayList() {
		
		assertTrue(intArrayList.remove(Integer.valueOf(50)));
		assertEquals(false, intArrayList.remove(Integer.valueOf(60))); //here we pass 60 as Integer Object
		assertNotNull(intArrayList.remove(3)); //here 3 is index
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBoundsException() {
		
		intArrayList.remove(60); //here this 60 as treated as index in array list
	}

}
