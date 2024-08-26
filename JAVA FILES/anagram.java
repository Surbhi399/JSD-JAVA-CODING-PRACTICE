mport java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        char[] s1 = A.toCharArray();
        char[] s2 = B.toCharArray();
            java.util.Arrays.sort(s1);
            java.util.Arrays.sort(s2);
            boolean result = java.util.Arrays.equals(s1, s2);
return result;
            
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}