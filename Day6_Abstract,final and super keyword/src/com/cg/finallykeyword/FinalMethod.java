package com.cg.finallykeyword; 
class C
{


void accept()
{
	 System.out.println("new one");
}
} 
class D extends C
{
	void run()
	{
		System.out.println("old one");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           D d=new D();
           d.accept();
           d.run();
	}

}
