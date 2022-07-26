package com.cg.exception;

import java.io.IOException;
import java.util.Scanner;

public class FinallyBlock {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("second time");//also print
		try {
			
		int y=20/5;//Dint y=15/0;0 will not work here
		System.out.println(y);
		//System.exit(0);// further this line no print statement will print in output
		
		}
		catch(Exception e)
		{
			throw new IOException("ioexcepoin");
			
		}
		finally
		{
			System.out.println("hiii second time");
		//	System.exit(0);// further this line no print statement will print in output
		}
		System.out.println("m21 batch");//this print statement also printed in outpur either out of finnaly 
		
		s.close();
		
	

	}

}
