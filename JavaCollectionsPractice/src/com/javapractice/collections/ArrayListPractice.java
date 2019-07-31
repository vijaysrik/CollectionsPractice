package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		// Build an Array
		List<String> colorArray = new ArrayList<String>();
		colorArray.add("Red");
		colorArray.add("Green");
		System.out.println(colorArray);

		Iterator<String> itr = colorArray.iterator();
		while (itr.hasNext()) {
			System.out.println("From Iterator :" + itr.next());
		}

		
		colorArray.add(0, "Green");
		System.out.println("Adding first element " + colorArray);
		System.out.println("The color in second place is " + colorArray.get(1));

		colorArray.remove(1);
		colorArray.add(1, "Green");
		System.out.println("Array after replacing red " + colorArray);

		colorArray.set(1, "Red");
		System.out.println("Replacing the second element with set method" + colorArray);

		/* Remove the third element */
		colorArray.remove(2);
		System.out.println("Array with third element removed " + colorArray);

		/*** Adding more elements */
		colorArray.add("Orange");
		colorArray.add("Yellow");
		colorArray.add("Blue");
		colorArray.add("Purple");
		System.out.println("Array after adding more elements " + colorArray);

		/** Search for an element **/
		if (colorArray.contains("Purple")) {
			System.out.println("Purple found!");
		} else {
			System.out.println("Purple not found!");
		}

		/** Sort the ArrayList **/
		Collections.sort(colorArray);
		System.out.println("ArrayList after sorting " + colorArray);

		/** Copy ArrayList to another **/
		List<String> copyColorArray = new ArrayList<String>();
		copyColorArray.add("Gold");
		copyColorArray.add("Silver");
		copyColorArray.addAll(colorArray);
		System.out.println("Copied Array " + copyColorArray);

		/** Copy ArrayList using Collections.copy */
		List<String> copyColorArray2 = new ArrayList<String>();
		copyColorArray2.add("A");
		copyColorArray2.add("B");
		copyColorArray2.add("C");
		copyColorArray2.add("D");
		copyColorArray2.add("E");
		copyColorArray2.add("F");
		Collections.copy(copyColorArray2, colorArray);
		System.out.println("Copy Color Array 2" + copyColorArray2);

		/*** Shuffle the arraylist ***/
		System.out.println("Before shuffle " + colorArray);
		Collections.shuffle(colorArray);
		System.out.println(colorArray);

		/** Reverse the array **/
		Collections.reverse(colorArray);
		System.out.println("Reversed Colors " + colorArray);

		/** Reverse using logic **/
		int length =colorArray.size();
		for(int i=0;i< (length)/2;i++) {
			String temp = colorArray.get(i);
			colorArray.set(i, colorArray.get(length-1-i));
			colorArray.set(length-1-i, temp);
			
		}
		System.out.println("Reverse from logic "+colorArray);

		/** Extract a portion of ArrayList **/
		List<String> subA= colorArray.subList(2,5);
		System.out.println("Sub Array "+ subA);

		/** Compare two ArrayLists **/
		subA.add("Gold");
		subA.add("Silver");
		System.out.println("subA "+subA);
		System.out.println("colorArray "+ colorArray);
		List<String> comparedElements = new ArrayList<String>();
		for(String e : colorArray) {
			if(subA.contains(e)) {
				comparedElements.add(e);
			}
		}
		System.out.println("Common Elements in both arrays "+comparedElements);

		/** Swap two elements in ArrayList **/
		System.out.println("Before swapping 2 and 6"+colorArray);
		String swapTemp = colorArray.get(6);
		colorArray.set(6, colorArray.get(2));
		colorArray.set(2, swapTemp);
		System.out.println("After swapping 2 and 6"+colorArray);

		/** Using Collections.swap**/
		Collections.swap(colorArray, 2, 6);
		System.out.println("After swapping 2 and 6 with collections"+colorArray);

		/** Join two ArrayLists**/
		ArrayList<String> joinedList = new ArrayList<String>();
		joinedList.addAll(colorArray);
		joinedList.addAll(copyColorArray2);
		System.out.println("Joined List "+joinedList);

		/**** Emptying an ArrayList */
		copyColorArray2.removeAll(copyColorArray2);
		System.out.println(copyColorArray2);

		joinedList.add("A");
				joinedList.add("B");		
						joinedList.add("C");
		System.out.println("joinedList "+ joinedList);
		System.out.println("colorArray " +colorArray);
		
		joinedList.removeAll(colorArray);
		System.out.println("joinedList after removeall "+ joinedList);
		System.out.println("colorArray after removeall" +colorArray);
		
		if(joinedList.isEmpty()) {
			System.out.println("Joined List is Empty");
		}
		else {
			System.out.println("Joined List is not empty and has a size of "+ joinedList.size());
		}
		/** Increase the size */
		joinedList.ensureCapacity(10);
		System.out.println("Increased size "+joinedList);
		/*** Trim the list size to current capacity **/
			System.out.println("joined list before trim "+joinedList);
		joinedList.trimToSize();
		System.out.println("joined list after trim "+joinedList);
		/** Print all elements using the position of elements**/
		for(int i=0; i<colorArray.size();i++) {
			System.out.println("Position "+i +"   Element "+colorArray.get(i));			
		}
		
	}

}
