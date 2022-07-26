package com.tns.strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Have you seen snowpiercer");
		System.out.println(str);
		Scanner s1 = new Scanner(System.in);
		String str1 = new String(s1.nextLine());
		System.out.println(str1);
		s1.close();

	}

}
