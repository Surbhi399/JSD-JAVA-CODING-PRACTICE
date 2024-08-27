  class Animal
{
	public void eat() {
		System.out.println("Animal Eating Style");
	}
	
	public void sleep() {
		System.out.println("Animal Sleeping Style");
	}
	
	public void foodHabit() {
		System.out.println("Animal foodhabit Style");
	}
}


class Deer extends Animal1
{
	public void eat() {
		System.out.println("Deer Eating Style ---> Veg");
	}
	
	public void sleep() {
		System.out.println("Deer Sleeping Style ----> in Night");
	}
	
	public void foodHabit() {
		System.out.println("Deer  foodhabit Style ----> Green Vegitable");
	}
}

class Fox extends Animal1
{
	public void eat() {
		System.out.println("Fox Eating Style --->  Non Veg");
	}
	
	public void sleep() {
		System.out.println("Fox Sleeping Style ----> in Day");
	}
	
	public void foodHabit() {
		System.out.println(" Fox foodhabit Style ----> meet");
	
}}


class Monkey extends Animal1
{
	public void eat() {
		System.out.println("Monkey Eating Style --->  Veg");
	}
	
	public void sleep() {
		System.out.println("Monkey Sleeping Style ----> in Night");
	}
	
	public void foodHabit() {
		System.out.println(" Monkey foodhabit Style ----> fruit");
	}
	
}


public class AnimalLife 
{

	static public void  main(String[] args) 
	{
		Fox t = new Fox();
		Animal1 ref;
		ref = t;
		ref.eat();

	}
}


