import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    
 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
 {
        int Alice =0;//variable for alice points 
        int Bob =0;//variable for bob points 
        List<Integer> ans = new ArrayList<>();// new array for assigning ans
        for(int i =0;i<3;i++ )
        {
        if(a.get(i) > b.get(i)) Alice++; //if a[i] > b[i], then Alice is awarded 1 point.
        if(a.get(i) < b.get(i)) Bob++;//If a[i] < b[i], then Bob is awarded 1 point.
}
        ans.add(0,Alice);//ans[0] contains  points recieved by alice 
        ans.add(1,Bob);//ans[0] contains points recieved by bob 
        return ans;//returning array type data of alice and bob points
}}

public class Solution {
    public static void main(String[] args) throws IOException
{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result.compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
