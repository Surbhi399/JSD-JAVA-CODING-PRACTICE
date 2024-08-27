class Animal_0
{
	public void eat()
	{
	System.out.println("Eat method");	
	}
	public void sleep()
	{
	System.out.println("Sleep method");
	}
    public void foodHabit()	
    {
    	System.out.println("foodHabit method");
    }
}
class Deer1 extends Animal_0
{
	public void eat()
	{
		System.out.println("Deer eats grass");
	}
	public void sleep()
	{
		System.out.println("Deer sleeps at night");
	}
	public void foodHabit()
	{
		System.out.println("Deer is a herbivores animal in nature");
	}
}

class Tiger extends Animal_0
{
	public void eat()
	{
		System.out.println("Tiger eats Flesh");
	}
	public void sleep()
	{
		System.out.println("Tiger sleeps at night");
	}
	public void foodHabit()
	{
		System.out.println("Tiger is a Carnivores animal in nature");
	}
}

class Monkey1 extends Animal_0
{
	public void eat()
	{
		System.out.println("Monkey eats fruit");
	}
	public void sleep()
	{
		System.out.println("Mokey sleeps at night");
	}
	public void foodHabit()
	{
		System.out.println("Monkey is a Omnivores animal in nature");
	}
}
class Creatures{
	void allowed(Animal_0 a)
	{
		a.eat();
		a.sleep();
		a.foodHabit();
	}
}

public class Animal1 {

	public static void main(String[] args) {
		 Deer1 da= new Deer1();
		 Tiger ta=new Tiger();
         Monkey1 ma=new Monkey1();
         Creatures c = new Creatures();
        c.allowed(da);
        c.allowed(ta);
        c.allowed(ma);
	     
	
	}
}