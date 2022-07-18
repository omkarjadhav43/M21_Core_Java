package com.cg.abs;


abstract class Fruit
{
	abstract void display();
}
class Apple
{
	void display()
	{
		System.out.println("Apple is good for our health");
		
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple f=new Apple();
		f.display();
		
	

	}

}
