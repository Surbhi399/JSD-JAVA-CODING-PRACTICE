class Cat
{
	private String name;
	private String breed;
	private int cost;
	
	void setCat(String name, String breed,int cost)
	{
		this.name =name;
		this.breed = breed;
		this.cost = cost;
	}
	String getName()
	{
		return name;
	}
	String getBreed()
	{
		return breed;
	}
	int getCost()
	{
		return cost;
	}
	
	
	}
public class DemoOfGetSet {

	public static void main(String[] args) {
	 Cat d = new Cat();	
	 d.setCat("kitty", "fluffy", 10000);
	 System.out.println(d.getName()+ " " + d.getBreed() +" " +d.getCost() );
	}

}
