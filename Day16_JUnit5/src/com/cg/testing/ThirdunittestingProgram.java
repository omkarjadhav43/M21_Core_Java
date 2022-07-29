package com.cg.testing;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class ThirdunittestingProgram {
	@Test
	@DisplayName("Test is Successfully Implemented")
	public void function()
	{
		System.out.println("Want to display a name");
	}
	@Test
	@Disabled("Not Implemented")
	public void function1()
	{
		System.out.println("Fails");

	}
}
