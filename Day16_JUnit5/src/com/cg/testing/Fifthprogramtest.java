package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class Fifthprogramtest {

	@Test
	@Disabled
	public void trueAssumption()
	{
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	@Test
	@Disabled
	public void falseAssumption()
	{
		assumeFalse(5<1);
		assertEquals(5+2,7);
	}
	@Test
	public void assumeThat()
	{
		String str = "Parag";
		assumingThat(str.equals("gra"),()->assertEquals(2+3,5));

}
}
