package com.cg.regexp;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "M-21 @@ Mahendra Patel @@ Omkar @@ Prashant";
		String[] res = str.split("@@");
		for(String i : res)
		{
			System.out.println(i);
		}
		s.close();
	}

}