package com.cg.exception;

public class ThrowKeyword {
	public static void validate(int age) throws Exception
	{
	    if(age<21 || age>27)
	    	throw new Exception("second time");
	    
	    else {
	    	System.out.print("om");
	    
	    }
	    	
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(30);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		System.out.print("12om");

	}

}
