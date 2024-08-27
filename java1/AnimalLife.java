class Animal
{
	void eat()
	{
		System.out.println("Animals eat food.");
	}

	void sleep()
	{
	System.out.println("Animals used to sleep .");	
	}


}
class Deer extends Animal
{
	void eat()
	{
		System.out.println("Deer  eats grass.");
	}

	void FoodHabit()
	{
		System.out.println("Deer is a herbivores animal.");
	}
}
class Monkey extends Deer
{
	void eat()
	{
		System.out.println("Monkey  eats banana.");
	}

	void FoodHabit()
	{
		System.out.println("Monkey is a herbivores animal.");
	}
	void jump()
	{
		System.out.println("Monkey used to jump there and here.");
	}

}
class Tiger extends Monkey
{
 		
 		void eat()
	{
		System.out.println("Tiger eats flesh.");
	}

	void FoodHabit()
	{
		System.out.println("Tiger is a carnivores animal.");
	}

}
class AnimalLife
{
	
		public static void main (String [] args)
	{
			
		Deer d = new Deer();
		d.eat();
		d.sleep();
		d.FoodHabit();
		Monkey m = new Monkey();
		m.eat();
		m.sleep();
		m.FoodHabit();
		m.jump();
		Tiger t = new Tiger ();
		t.eat();
		t.sleep();
		t.FoodHabit();
	}
}