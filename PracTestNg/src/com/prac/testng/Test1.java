package com.prac.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println(s);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}
}
