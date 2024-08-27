class Dog2{
	private String name;
	private String breed;
	private int cast;
	
	Dog2(String name, String breed , int cast){
		this.name = name;
		this.breed = breed;
		this.cast = cast;
		
				
	}
	
	String getName() {
		return name;
	}
	String getBreed() {
		return breed;
	}
	int getCast(){
		return cast;
	}
}


class Demo{
	public static void main(String args[] ){
		 Dog2 d = new Dog2("Jimmy", "bug", 2000);
		 System.out.println(d.getName());
		 System.out.println(d.getBreed());
		 System.out.println(d.getCast());
		
	}
}
