// code for explainning polymorphic apporach


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
void FoodHabit()
{
	System.out.println("animals eat different kind of food.");
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
class Creature 
{
	void allow(Animal a)
	{
		a.eat();
		a.sleep();
		a.FoodHabit();
	}
}
class AnimalLife2
{
	
		public static void main (String [] args)
	{
		Deer d = new Deer();
		Monkey m = new Monkey();	
		Tiger t = new Tiger ();
		Creature c = new Creature();
		c.allow(d);
		c.allow(m);
		c.allow(t);
	}
}