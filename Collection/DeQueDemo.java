package com.bjs.Collection;
import java.util.*;

public class DeQueDemo {

	public static void main(String[] args) {
		 ArrayDeque dq = new ArrayDeque();
		 dq.add(1000);
		 dq.addFirst(11.11f);
		 dq.addLast("SURBHI");
		 System.out.println(dq);
		 //dq.addAll(dq);
		 
		 
		 System.out.println(dq);
		 dq.clone();
		 System.out.println(dq);
		 System.out.println(dq.contains(1000));
		 System.out.println(dq.containsAll(dq));
		 System.out.println(dq.element());
		 System.out.println(dq.getFirst());
		 System.out.println(dq.getLast());
		 System.out.println(dq.getClass());
		 System.out.println(dq.hashCode());
		 System.out.println(dq.isEmpty());
		 System.out.println(dq.offer(10)); // end position
		 System.out.println(dq.offerFirst('a'));// first position
		 System.out.println(dq.offerLast("labhesh")); // last position
		 System.out.println(dq.peek());
		 System.out.println(dq);
		 System.out.println(dq.peekFirst());
		 System.out.println(dq);
		 System.out.println(dq.peekLast());
		 System.out.println(dq);
		 System.out.println(dq.poll());// remove the 1st element
		 System.out.println(dq);
		 System.out.println(dq.pollFirst());//remove the first element
		 System.out.println(dq);
		 System.out.println(dq.pollLast());// remove the last element
		 System.out.println(dq);
		 System.out.println(dq.pop());//remove the 1st element of list
		 System.out.println(dq);
		 dq.push("SURBHI");//insert element in 0 index
		 System.out.println(dq);
		 System.out.println(dq.retainAll(dq));
		 System.out.println(dq.remove("SURBHI"));
		 System.out.println(dq);
		 System.out.println(dq.removeFirst());
		 System.out.println(dq);
		 dq.add("Labhesh");
		 dq.addFirst("Labhesh");
		 System.out.println(dq);
		 dq.addLast(10);
		 System.out.println(dq);
		 System.out.println(dq.removeFirstOccurrence("Labhesh"));
		 System.out.println(dq);
		
		 System.out.println(dq);
		 System.out.println(dq.removeLast());
		 System.out.println(dq);
		 System.out.println(dq.removeLastOccurrence(10));
		 dq.addLast(3000);
		 System.out.println(dq);
		 
		 System.out.println(dq.size());
	     dq.clear();
		 System.out.println(dq);
		 
		 
		 
		 
		 

	}

}
