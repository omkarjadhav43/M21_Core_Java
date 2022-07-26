package com.cg.poiymorphism;

//To change parameters/data types of arguments by having different data types in same method.
class Shape1
{
	int area(int a) 
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Shape1 s = new Shape1();
		System.out.println(s.area(5));
		System.out.println(s.area(10,20));
	

	}
}
