package com.bjs.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.8f);
		al.add("ABHI");
		al.add('L');
		al.add(0, 1000);
		//al.addAll(al);
		//al.addAll(2, al);
		//al.clone();
		//al.forEach(action);
		//al.clear();
		
		System.out.println(al.lastIndexOf(10.8f));
		System.out.println(al.remove(0));
		System.out.println(al.iterator());
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.remove(al));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.subList(1, 3));
		System.out.println();
		System.out.println(al.contains(10));
		System.out.println(al.containsAll(al));
		System.out.println(al.equals(1000));
		System.out.println(al.get(3));
		System.out.println(al.getClass());
		System.out.println(al.indexOf('L'));
		System.out.println(al.hashCode());
		System.out.println(al.set(0, 2000));
		System.out.println(al);
		System.out.println(al.removeAll(al));
		System.out.println(al.size());
		al.
		 
		
		
		
	}

}
