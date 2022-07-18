package com.cg.abs;

 abstract class car
{
	abstract void display();
}
class Audi extends car
{
	void display()
	{
		System.out.println("Audi");
	}
}
public class FinalAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Audi s=new Audi();
         s.display();
	}

}
