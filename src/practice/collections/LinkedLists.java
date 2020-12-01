package practice.collections;

import java.util.LinkedList;

public class LinkedLists {

	//find an element inside a linkedlist
	public static void main(String[] args) {
		
		LinkedList<Integer> ints = new LinkedList<Integer>();
		
		ints.add(2);
        ints.add(-6);
        ints.add(4599);
        ints.add(43);
        ints.add(5);
        ints.add(24);
        
        //get the first and last element of a linkedList without knowing the elements
        System.out.println("First element = " + ints.getFirst());
        System.out.println("Last element = " + ints.getLast());
        
        //search for an element's index when you know the elements of the list
        System.out.println("index of element '-6' = " + ints.indexOf(-6));
        System.out.println("index of element '24' " + ints.lastIndexOf(24));
        
	}	
	
}
