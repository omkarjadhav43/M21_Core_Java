package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

public class FourthUnitTestProgram {

			// TODO Auto-generated method stub
		@Test
		public void display()
		{
			int arr[] = {1,2,3,4,5};
			//assertEquals method will check whether the two parameters values are same or not.
			//If it is same then then you will not get any failure otherwise you will get failure.
			assertAll("arr",()->assertEquals(arr[1],2));

	}

}
