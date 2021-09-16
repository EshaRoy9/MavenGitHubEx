package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.Demo.Calculator;
import com.lti.Demo.MyApp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	void testshow() {
		MyApp m = new MyApp();
		String s=m.show();
		Assertions.assertEquals("Hello Maven", s,"Checking the strings");
	}
	
	@Test
	void testAdd() {
		int r=Calculator.add(100, 200);
		
		Assertions.assertEquals(300, r);
		Assertions.assertEquals(100, Calculator.add(50, 50),"Testing add method");
		Assertions.assertNotEquals(100, r);
	}
	@Test
	void testAssertfalse() {
		Assertions.assertFalse("Esha".length()==10);
		Assertions.assertFalse(10>20,"comparing two values");
	}
	@Test
	void testAssertNull(){
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
//	@Test
//	void AssertAll() {
//		String s1="abc";
//		String s2="pqr";
//		String s3="xyz";
//		Assertions.assertAll(
//				() -> Assertions.assertEquals(s1, "abc"),
//				() -> Assertions.assertEquals(s2, "pqr"),
//				() -> Assertions.assertEquals(s3, "xyz")
//				);
//	}
//	@Test
//	void testCollections() {
//		ArrayList<String> myList=new ArrayList<>();
//		myList.add("Hello");
//		Assertions.assertFalse(myList.isEmpty());
//		
//		ArrayList<Integer> myList1=new ArrayList<>();
//		Assertions.assertEquals(true, myList1.isEmpty());
//	}
	
	
	
	
	
	
	
}
