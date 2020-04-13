package com.qa.customs.tests;

import org.testng.annotations.Test;

public class Custom_2004 {

	
	@Test
	public void setup() {
		
		System.out.println("Running setup for tests");
		System.out.println("Performing Initialization");
	}
	
	@Test
	public void customFeatureTest() {
		
		
		System.out.println("Running code to check functionality of the "
				+ "feature added in custom-2004");
	}
	
}
