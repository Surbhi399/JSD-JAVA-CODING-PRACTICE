import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n =1;

    Scanner scan = new Scanner(System.in);
            while(scan.hasNext())
            {
            String line = scan.nextLine();
            System.out.println(n +" "+line ); 
            n++; 
            }
        //Close the scanner  
        scan.close();  


    
    }
}
