package week2.day1;

//import java.util.Scanner;

/*
 * TODO - 1

1. Write a note on == and .equals
2. How do you check if a given String is Palindrome or not? (write is a function)
madam == madam
For example,"121" is a palindrome, but "123" is not 
3. find the occurance of 'e' from "selenium"
 * */

public class Palindrome {
 //Scanner sc = new Scanner(System.in);
 // String str = sc.nextLine();
  String str ="madamxmada";
  String rev ="";
   
	public  void checkPalindrome() {
		//System.out.println("Enter a String:  " );
		
		char charArray[]=str.toCharArray();
		for(int i= charArray.length-1;i>=0;i-- ) {
			rev = rev +charArray[i];
		}
		if(str.equals(rev)) {
			System.out.println("It's a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		
	}
	
	
}
