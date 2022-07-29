package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram 
{
	@Test
	
	 void accept()
	{
		char ch='o';
		
		System.out.println("junit5"+ch);
	}
	@Test
	@BeforeAll
	static void huge()
	{
		
		System.out.println("hii, whats'aap");
	}
	@Test
	@BeforeEach
	void old()
	{
		int x=5;
		System.out.println(x);
	}
}
