package com.cg.poiymorphism;
// constructor overloading
//method overloading
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("renault kiger");
		
	}
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("speed is "+speed+" and engine is "+engine);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triber t=new Triber();
		Triber t1=new Triber(45 ,"disel");
		
		

	}

}
