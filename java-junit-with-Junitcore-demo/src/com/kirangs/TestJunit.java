package com.kirangs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	
	@Test
	public void test() {
		
		String str="JUnit is working fine";
		assertEquals("JUnit is working fine", str);
	}
	
	@Test
	public void testAdd() {
		
		assertEquals(45, 40+5);
	}

}
