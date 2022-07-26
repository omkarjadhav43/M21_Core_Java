package com.cg.inter;
interface vehicle
{
	void speed();
}
interface Car extends vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("interface56");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("sppedy way");
	}
}




public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b=new Bus();
		b.engine();
		b.speed();

	}

}