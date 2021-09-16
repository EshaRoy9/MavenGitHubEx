package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.Demo.Product;

class TestProduct {

	//@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testCompanyName() {
		Product p = new Product(101,"charger",10000.00,"Dmart");
		Assertions.assertEquals("Dmart",p.getCompanyName());
	}

}
