interface MyCalculator1 
{
	public void add();
	public void sub();
	}
interface MyCalculator2   
{
	public void mul();
	public void div();
	
}
interface MyCalculator3 extends  MyCalculator1,MyCalculator2 
{
	public void func1();
	public void func2();
	}

public class Launch2 {

	public static void main(String[] args) {
		

	}

}
