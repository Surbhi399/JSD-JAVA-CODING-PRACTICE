class Plane 
{
	void takeoff()
	{
		System.out.println("Plane is taking off. ");
	}
	void fly() {
		System.out.println("Plane is flying.");
	}
	void land()
	{
		System.out.println("Plane is going to land.");	
	}
}
class CargoPlane extends Plane
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
	void carryGoods()
	{
		System.out.println("CargoPlane carries goods");
	}
}
class PassengerPlane extends  Plane
{
	
	void fly() {
		System.out.println("PassengerPlane is flying at medium level.");
	}
	
	void carryPassenger()
	{
		System.out.println("PassengerPlane carries passengers.");
	}
}
class FighterPlane extends Plane
{
	void fly() {
		System.out.println("FighterPlane is flying at high height.");
	}
	
	void carryWeapons()
	{
		System.out.println("FighterPlane carries weapons.");
	}
	}

public class Launch {
	public static void main(String [] agrs) {
	Plane p = new Plane();
	p.takeoff();
	p.fly();
	p.land();
	
	CargoPlane c = new CargoPlane();
	c.takeoff();		// overridden method
	c.fly();			// overridden method
	c.land();			// overridden method
	c.carryGoods();		// specialized method
	
	PassengerPlane pp = new PassengerPlane();	
	pp.takeoff();			 // inherited method
	pp.fly(); 				// overridden method
	pp.land();				//inherited method
	pp.carryPassenger(); 	// specialized method
	
	FighterPlane fp = new FighterPlane();
	fp.takeoff();			 // inherited method
	fp.fly(); 				// overridden method
	fp.land();				//inherited method
	fp.carryWeapons(); 	// specialized method
	
	
	}
	

}
