package com.cg.exception;

import java.util.Scanner;

public class AirthmaticException {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		try {
			
		int y=15/x;
		System.out.println(y);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
		
	}

}
