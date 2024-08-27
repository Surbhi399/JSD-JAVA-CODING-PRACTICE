

abstract  class Plane1
{
	abstract void takeoff(); 
	abstract void fly();
	abstract void land(); 

}
class CargoPlane1 extends Plane1
{
	void takeoff()
	{
		System.out.println("CargoPlane is taking off. ");
	}
	void fly() {
		System.out.println("CargoPlane is flying at low level.");
	}
	void land()
	{
		System.out.println("CargoPlane is going to land.");	
	}
}
class FighterPlane1 extends Plane1
{
	
	void takeoff()
	{
		System.out.println("FighterPlane  is taking off. ");
	}
	void fly() {
		System.out.println("FighterPlane is flying at high height.");
	}
	void land()
	{
		System.out.println("FighterPlane  is going to land.");	
	}
}
class Airport 
{
	void allow(Plane1 p)
	{
		p.takeoff();
		p.fly();
		p.land();
	}
}

public class Abstract {
	public static void main (String [] args)
	{
		CargoPlane1 cp = new CargoPlane1();
		FighterPlane1 fp = new FighterPlane1 ();
		
		Airport a = new Airport();
		
		a.allow(cp);
		a.allow(fp);
	}
	
}
	
