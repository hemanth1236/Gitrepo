package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {

		String[] str = { "abc", "xyz", "lmn" };// array is fixed size we can't increase or decrease the size

		// Arraylist is dynamic we can increase and decrease the size at any time
		// order
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ganesha");// adding an element
		list1.add("Vinayaka");
		list1.add("Hemanth");
		list1.add("madhav");
		list1.remove(0);// removing an element

		System.out.println(list1);// for printing
		list1.set(2, "Ganesha");// set the value from old to new based on index

		System.out.println("the data at 2nd position " + list1.get(1));// get for printing the element

		System.out.println("the data at 1st position " + list1.get(0));

		System.out.println("the data at last position " + list1.get(list1.size() - 1));// size() will get the length of
		// array list

		// iterate through the list
		for (int i = 0; i < list1.size(); i++) {
			// System.out.println(list1.get(i));
			if (list1.get(i).equals("Vinayaka")) {
				System.out.println("Vinayaka is found at index " + i);
				break;
			}

		}

		for (String s : list1) {
			System.out.println(s);
		}

		// for sorting the collections in ascending order
		Collections.sort(list1);
		System.out.println(list1);

		// for storign the collection in descending order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);

	}

}
