package techanical_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Array_list {

	public static void main(String[] args) {

		// --> User Asked to find the duplicate values in Array List
		// -> here i have created a Duplicate values and by using the Hashset i have
		// Find the duplicate values

		ArrayList<String> Lis = new ArrayList<String>();
		Lis.add("Java");
		Lis.add("Python");
		Lis.add("TestNg");
		Lis.add("Selenium");
		Lis.add("Manual testing");
		Lis.add("TestNg");
		Lis.add("Java");
		Lis.add("Selenium");
		System.out.println("Duplicate values in Array List are listed below:");
		Set<String> S = new HashSet<String>();
		// --> for iteration purpose i have used the for each method
		for (String string : Lis) {
			if (S.add(string) == false) {
				System.out.println(string);

			}

		}

	}

}
