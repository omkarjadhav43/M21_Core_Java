package com.tns.operator;

import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		a%=b;
		System.out.print(a);
		s1.close();

	}
	

}
