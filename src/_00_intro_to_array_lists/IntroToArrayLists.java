package _00_intro_to_array_lists;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		//3. Print all the Strings using a standard for-loop
		for(int i=0;strings.size()>i;i++) {
			System.out.println(strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s : strings){
			System.out.println(s);
		}
		
		//5. Print only the even numbered elements in the list.
		for(int i=0;strings.size()>i;i++) {
			if(i%2==0) {
				System.out.println(strings.get(i));
			}
			else {
				System.out.println("Not even");
			}
		}
		System.out.println("\n");
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i=strings.size()-1;0<=i;i--) {
			System.out.println(strings.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0;strings.size()>i;i++) {
			if(strings.contains("e")) {
				System.out.println(strings.get(i));
			}
			else {
				System.out.println("There is no e.");
			}
		}
	}
}
