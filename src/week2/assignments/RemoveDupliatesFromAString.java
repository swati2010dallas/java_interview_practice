package week2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * How to remove all duplicates from a given string?
 * */
public class RemoveDupliatesFromAString {
static String str="aabbdeeff";
	public static void main(String[] args) {
		//char[] charStrArray = str.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(char ch:set) {
			System.out.print(ch);
		}

	}

}
