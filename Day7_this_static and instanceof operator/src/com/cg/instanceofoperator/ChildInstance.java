package com.cg.instanceofoperator;
class A
{
	
}

public class ChildInstance extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInstance c=new ChildInstance();
		System.out.println(c instanceof A);
		System.out.println(c instanceof ChildInstance );
		
		

	}

}
