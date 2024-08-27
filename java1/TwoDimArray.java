import java.util.Scanner;
class TwoDimArray
{
	public static void main(String [] args)
	{
		String [][] a = new String[3][4];
		Scanner s = new Scanner(System.in);

		System.out.println("ENTER THE VALUES:");
		
		for (int i=0;i<=a.length-1 ;i++ ) {
			for(int j=0;j<=a[i].length-1;j++ )
			{
				a[i][j]= s.next();
			}
			
		}

System.out.println(" THE VALUES ARE:");
		for (int i=0;i<=a.length-1 ;i++ ) {
			for(int j=0;j<=a[i].length-1;j++ )
			{
				System.out.println("(" +i +j+")"String +" :" + a[i][j]);
			}
			
		}

	}
} 