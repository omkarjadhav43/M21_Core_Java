package com.cg.poiymorphism; 
class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a+b);
	}
} 
class Mult extends Multiplication
{
	void accept(int x,int y)

{
	System.out.println(x*y);
}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mult m=new Mult();
		Multiplication m1=new Multiplication();
		m1.accept(4,12);
		m.accept(4,12);
		

	}

}
