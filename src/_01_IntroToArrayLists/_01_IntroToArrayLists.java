package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> arrayList = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		arrayList.add("Astrobiologist");
		arrayList.add("Computer Scienctist");
		arrayList.add("Cosmologist");
		arrayList.add("Theoretical physicist");
		arrayList.add("Mission specialist");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for (String item: arrayList) {
			System.out.print(item + " ");
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < arrayList.size(); i += 2) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).indexOf("e") != -1) {
				System.out.print(arrayList.get(i) + " ");
			}
		}
	}
}
