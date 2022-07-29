package com.cg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str);
		Scanner token=new Scanner(System.in);
		token.useDelimiter(" ");
		ArrayList<Object>arr=new ArrayList<Object>();
		while(token.hasNext())
			{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()-1));
			
			
			}
		System.out.println(arr);

	}

}
