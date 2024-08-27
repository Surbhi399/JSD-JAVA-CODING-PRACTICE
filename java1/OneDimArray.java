import java.util.Scanner;
class OneDimArray
{
public static void main (String [] args)
{
String [] a = new String[5];
Scanner s = new Scanner(System.in);

for(int i=0;i<=a.length-1;i++)
{
a[i]= s.next();
}
System.out.println("Name of five students are:");
for(int i=0;i<=a.length-1;i++)
{

System.out.println(a[i]);
}
}
}