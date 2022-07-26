package com.cg.inter;

 interface inf
 {
	/*public abstract*/ void display();
	

 }
  class Demo implements inf
 
 {

 

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface98546");
	}
}
/*public*/  class Main
 {
	 public static void main(String args[])
	 {
		 Demo d=new Demo();
		 d.display();
		 
	 }
 }