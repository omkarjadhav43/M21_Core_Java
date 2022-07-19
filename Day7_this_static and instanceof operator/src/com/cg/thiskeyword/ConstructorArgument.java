package com.cg.thiskeyword;
//this keyword can be passed as an argument in constructor call
class A
{
	int a;
	/*A()
	{
		
	}*/
	A(int a)
	{
		this.a=a;
		
	}
}

public class ConstructorArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A(9);
		System.out.println("the value: "+obj.a);
		

	}

}
