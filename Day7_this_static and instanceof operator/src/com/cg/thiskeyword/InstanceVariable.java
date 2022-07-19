package com.cg.thiskeyword;
class Fruit
{
	private String str;
	private String str1;
	void accept(String str,String str1)
	{
		this.str=str;
		this.str=str1;
		
	}
	void display()
	{
		System.out.println("the one "+str);
	    System.out.println("the two "+str1);
						
	}
}

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit();
		f.accept("om","om2");
		

	}

}
