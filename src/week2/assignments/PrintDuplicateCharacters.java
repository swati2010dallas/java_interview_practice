package week2.assignments;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * How to print the duplicate characters from the given String?
 * */

public class PrintDuplicateCharacters {
	static String str = "aabccdeeffghijj";

	public static void main(String[] args) {
		Map<Character,String> charMap = new HashMap<>();
		Map<Character,Integer> charKountMap = new HashMap<>();
//		Map<Character,Integer>> mEntrySet= charMap.entrySet();
		for(int i=0; i < str.length();i++) {
			
			// duplicate check
			if(charMap.containsKey(str.charAt(i))) {
				
					charMap.put(str.charAt(i), "Yes");
			}else {
				charMap.put(str.charAt(i), "No");
			}
			
			
			if(charKountMap.containsKey(str.charAt(i))) {
				int value = charKountMap.get(str.charAt(i));
				charKountMap.put(str.charAt(i), value+1);
			}else {
				charKountMap.put(str.charAt(i), 1);
			}
		}
		
		for (Character c : charMap.keySet()) {
			if (charMap.get(c).equals("Yes")) {
				System.out.println(c);
			}
		}
		
	//	for (Character c : charKountMap.keySet()) {
		//		System.out.println(c + " : "+ charKountMap.get(c));
		//}
		

	}

}
