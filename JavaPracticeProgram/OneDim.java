import java.util.Scanner;

public class OneDim {
   
    public static void main(String[] args)
    {
        int[] marks = new int[5]; 
        Scanner s = new Scanner(System.in);


        for(int i =0; i < marks.length; i++)
        {
             marks[i] = s.nextInt();
        }
System.out.println("Marks of 5 students are :");
         for(int i =0; i < marks.length; i++)
        {
            System.out.println( marks[i]);
        }
    } 

    
}
