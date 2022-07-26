package com.tns.strings;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello everyone";
		System.out.println(str1);
		Scanner s2 = new Scanner(System.in);
		String str2 = s2.next();
		if(str1.equals(str2))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		s2.close();

	}

}
