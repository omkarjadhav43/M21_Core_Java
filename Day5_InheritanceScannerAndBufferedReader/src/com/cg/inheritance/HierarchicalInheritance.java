package com.cg.inheritance;


class shoeBrand
{
	void displayname(String l)
	{
		System.out.println(l + " is the brand");
	}
}

class Nike extends shoeBrand
{
	void display2()
	{
		System.out.println("Nike shoe");
	}
}

class Adidas extends shoeBrand
{
	void display1()
	{
		System.out.println("Adidas shoe");
	}
}

class bata extends shoeBrand
{
	void display()
	{
		System.out.println("bata shoe");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shoeBrand h= new shoeBrand();
		bata b = new bata();
		
		Adidas a = new Adidas();
		Nike n = new Nike();
		h.displayname("shoeBrand");
		b.display();
		a.display1();
		n.display2();
	}

	}


