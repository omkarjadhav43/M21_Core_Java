package com.cg.abs;

abstract class A
{
	void print()
	{
		System.out.println("Non abstact");
		
	}
}
class B extends A
{
	
}
public class NonAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A a=new B();
          a.print();
	}

}
