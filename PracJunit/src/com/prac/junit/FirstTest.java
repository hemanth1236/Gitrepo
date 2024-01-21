package com.prac.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("set up before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is set up before every test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is set up after every test");
	}

	@Test
	public void test() {
		int op1 = 10;
		int op2 = 20;
		int actualsum, expected;
		expected = op1 + op2;
		actualsum = 30;
		if (actualsum == expected) {
			System.out.println("testcase passed");
		} else {
			System.out.println("test case failed");
		}
	}

}
