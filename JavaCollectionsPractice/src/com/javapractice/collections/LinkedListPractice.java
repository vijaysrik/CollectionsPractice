package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * Practice Exercise to understand LinkedList methods
 * @author vijay
 *
 */

public class LinkedListPractice {

	public static void main(String[] args) {
		
		/** Creating a LinkedList **/
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add(0, "First");
		linkedList.add(1, "Second");
		linkedList.add(2, "Third");
		System.out.println("Created List "+ linkedList);
		
		/*** Appending an element at the end **/
		linkedList.add("last");
		System.out.println("Appended last "+ linkedList);
		
		/** Iterate through linked list */
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println("Through iterator "+ itr.next());
		}
		
		/** Iterate starting at specific location*/
		for(int i=2; i<linkedList.size();i++) {
			System.out.println("Starting from third element" + linkedList.get(i));
		}
		/** Iterate starting at specific location* Answer -2/
		 * 		
		 */
		Iterator<String> it = linkedList.listIterator(2);
	/*	while(it.hasNext()) {
			System.out.println("Through iterator starting at third element "+ it.next());
		}*/
		System.out.println("Testing foreach remaining +++++++");
		it.forEachRemaining(System.out::println);		
		System.out.println("Testing foreach remaining +++++++");		
		/** Iterate in reverse order **/
		ListIterator<String> it_rev= linkedList.listIterator(linkedList.size());
		while(it_rev.hasPrevious()) {
			System.out.println("Through iterator starting at end  "+ it_rev.previous());
		}
		
		/** Iterate in reverse **/
		System.out.println("Reverse print start======");
		linkedList.descendingIterator().forEachRemaining(System.out::println);
		System.out.println("Reverse print end======");
		
		/** Insert an element at a specified position **/
		linkedList.add(1,"insert");
		System.out.println(linkedList);
		
		
		/**Insert an element at the front position with/without offer**/
		linkedList.add(0,"front");
		System.out.println(linkedList);
		linkedList.offerFirst("front with offer");
		linkedList.offerLast("Last with offer");
		System.out.println(linkedList);
		
		/** Insert a group of elements at one position **/
		List<String> items = new ArrayList<String>();
		items.add("Shrini");
		items.add("Sid");
		linkedList.addAll(2, items);
		System.out.println(linkedList);
		
		/** Check the first and Last occurence **/
		linkedList.add(7,"Shrini");
		System.out.println(linkedList);
		System.out.println("First Occurence of Shrini "+ linkedList.indexOf("Shrini"));
		System.out.println("Last Occurence of Shrini "+ linkedList.lastIndexOf("Shrini"));

		/** Display the elements and their index **/
		for(int i=0; i<linkedList.size();i++) {
			System.out.println("Index is "+ i +"  Element is "+ linkedList.get(i));
		}
		
		/** Remove a specified element**/
		linkedList.remove("Sid");
		System.out.println(linkedList);
		
		/** Remove first and last occurrence of an element **/
		linkedList.removeFirstOccurrence("Shrini");
		linkedList.removeLastOccurrence("Shrini");
		System.out.println(linkedList);
		
		/** Remove all elements **/
		LinkedList<String> newList = new LinkedList<String>();
		newList.add("Mom");
		newList.add("Dad");
		newList.add("Son");
		newList.add("Daughter");
		System.out.println(" New List "+newList);
		newList.removeAll(newList);
		System.out.println(newList);
		
		/** Swapping 2 elements **/
		newList.add("Mom");
		newList.add("Dad");
		newList.add("Son");
		newList.add("Daughter");
		Collections.swap(newList, 2, 3);
		System.out.println("After Swapping "+newList);
		
		/**Shuffle the elements **/
		Collections.shuffle(newList);
		System.out.println("After Shuffling "+newList);
		
		/** Join of LinkedList **/
		LinkedList<String> joinedList = new LinkedList<String>();
		joinedList.addAll(linkedList);
		joinedList.addAll(newList);
		System.out.println("join list " +joinedList);
		
		/** Clone of LinkedList **/
		LinkedList<String> clonedList = new LinkedList<String>();
		clonedList=(LinkedList<String>)linkedList.clone();
		System.out.println("cloned list " +clonedList);
		
		/** to remove and return the first element of a linked list*/
		String firstElement=clonedList.pollFirst();
		System.out.println("First Element "+ firstElement +" clonedList "+clonedList);

		/**to retrieve but does not remove, the first element of a linked list */
		firstElement = clonedList.peekFirst();
		System.out.println("First Element "+ firstElement +" clonedList "+clonedList);
		
		/** to retrieve but does not remove, the last element of a linked list.*/
		String lastElement = clonedList.peekLast();
		System.out.println("Last Element "+ lastElement +" clonedList "+ clonedList);
		
		/** to check if a particular element exists in a linked list. */
		if(clonedList.contains("insert")) {
			System.out.println("Element found!");
		}
		else {
			System.out.println("Element not found!");
		}
		
		/** To convert a linked list to array list. */
		
	}

}
