package week2.day2.collections;
/*1. Create a list add 5 of your friends names
2. 1 name must be duplicate
3. Print all the data 1 by 1
4. Check if the duplicate name is there in the list
5. Delete all the names
6. Confirm list has no values
 * */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsPractice {

	public static void main(String[] args) {
		List<String> friendList = new ArrayList<String>();
		
		friendList.add("Bulia");
		friendList.add("Mini");
		friendList.add("Lucky");
		friendList.add("Amita");
		friendList.add("Bulia");
		System.out.println("Number of elements in the List: " + friendList.size());
		
		System.out.println(friendList.get(0));
		System.out.println(friendList.get(1));
		System.out.println(friendList.get(2));
		System.out.println(friendList.get(3));
		System.out.println(friendList.get(4));
		//To remove duplicates
		Set<String> friendSet = new HashSet<String>(friendList);
		System.out.println(friendSet.size());
		
		friendList.clear();
		System.out.println("Number of elements in the List: " + friendList.size());
		
		

	}

}
