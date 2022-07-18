package com.tns.decisionmaking;
import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		switch(a) 
		{
		case 1:
			System.out.println("5421");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("5864");
			break;
		default:
			System.out.println("Invalid input");
			s.close();
		}

	}

}
