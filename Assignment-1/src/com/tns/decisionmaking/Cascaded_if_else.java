package com.tns.decisionmaking;

public class Cascaded_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=41,b=8457,c=5487;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>a && b<c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

	}


