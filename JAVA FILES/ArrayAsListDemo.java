import java.util.*;
class ArrayAsListDemo
{
	public static void main(String[] args) {
		String[] s ={"A","N","B"};
		List l = Arrays.asList(s);
		System.out.print(l);
		s[0]="K";
		System.out.print(l);
		l.set(1,"L");
		for(String s1: s)
			System.out.print(s1);
	}

}