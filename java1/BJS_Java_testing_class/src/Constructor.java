class Dog1
{
	private String name;
	private String breed;
	private int cost;
	
	Dog1(String name,String breed, int cost)
	{
	this(name);	
	}
	String getname()
	{
		return name;
	}
	String getbreed()
	{
		return breed;
	}
	int getcost()
	{
		return cost;
	}
	Dog1()
	{
		name = "Rocky";
		breed ="German shepHred";
		cost = 5000;
	}
	Dog1(String name)
	{
		this.name = name;
	}
	}


public class Constructor 
{

	public static  void main(String [] args) 
	{
		Dog1 d = new Dog1("Jimmy","pug",1000);
		System.out.println(d.getname()+" "+d.getbreed()+" "+d.getcost());
		Dog1 d1 = new Dog1();
		System.out.println(d1.getname()+" "+d1.getbreed()+" "+d1.getcost());

	
	}

}
