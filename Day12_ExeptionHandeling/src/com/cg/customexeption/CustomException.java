package com.cg.customexeption;

import java.util.Scanner;

class NameNotFound extends Exception
{
	 NameNotFound(String name)
	 {
		 super(name);
		 
	 }
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		try
		{
			empname(str);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
	}
	static void empname(String str)throws NameNotFound
	{
		
		if(str.isEmpty())
		{
			throw new NameNotFound("hiiii ");
			
			
		}
		else
		{
			System.out.println("hii "+str+",");
		}

	}

}
