package com.cg.inter;
interface R
{
	void dispaly();
}
interface T
{
	void print();
}
class Y implements R,T
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new one");
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("old one");
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y u=new Y();
		u.print();
		u.dispaly();

	}

}
