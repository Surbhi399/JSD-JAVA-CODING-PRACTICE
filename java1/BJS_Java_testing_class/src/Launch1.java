interface MyCalculator
{
	 public void add();
	public void sub();
}
class Calculator implements MyCalculator 
{
	public void add()
	{
		int a=10;
		int b = 20;
		int c= a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=20;
		int b = 10;
		int c= a-b;
		System.out.println(c);
	}
	public void mul()
	{
		int a=20;
		int b = 10;
		int c= a*b;
		System.out.println(c);
	}
}
class Math
{
public void permit(MyCalculator ref)
{
	ref.add();
	ref.sub();
	((Calculator) ref).mul();
}


}
public class Launch1
{
	public static void main(String args [])
	{
	Calculator cal = new Calculator();
	Math m = new Math();
	m.permit(cal);

}
	}
