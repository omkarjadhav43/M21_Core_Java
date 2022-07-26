package com.cg.anonymous;
abstract class Annonmous
{
	abstract void display();
}

public class anon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Annonmous a=new Annonmous()
				 {
		public void display()
		 {
			 System.out.println("new router");
		 }

	};
	a.display();

}
}