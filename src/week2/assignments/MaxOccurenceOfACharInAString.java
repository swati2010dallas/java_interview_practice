package week2.assignments;

import java.util.HashMap;
import java.util.Map;

/*
 * How to find the maximum occurring character in a given String?
e.g., if the input string is "Java" then the function should return 'a'.
*/

public class MaxOccurenceOfACharInAString {
 static String str = "Java";
 static char charStr[] =str.toCharArray();
	public static void main(String[] args) {
		Map<Character,Integer> myMap = new HashMap<>();
		//To find the number of occurence
		int value = 0;
		for(char c:charStr) {
			if(myMap.containsKey(c)) {
				value=myMap.get(c);
				myMap.put(c, value+1);
			}else {
				myMap.put(c, 1);
			}
		}
			//To print the values
		
		int max = 0,val =0;
		char key =' ';
			for(char ch:myMap.keySet()) {
								
				System.out.println(ch + " No of occurence=>" + myMap.get(ch));
				val=myMap.get(ch);
				
						if(val > max) {
							max=val;
							key=ch;
						System.out.println("Max occrence of char : " + key + " is "+ max);
									
				}
				
				
			}
		}
		




	}

