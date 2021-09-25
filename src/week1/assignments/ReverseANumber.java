package week1.assignments;

import java.util.Scanner;

/*
 * 
 * Reverse a number 123
 * 
 * digit = num%10; 12 1 =
 * rev = rev *10+ digit
 * num =num/10;
 * 
 * 
 * */
public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("number is : " + num);
		int digit,rev =0;
		 while(num >0) {
			 digit = num%10;
			 rev = rev*10 +digit;
			 num= num/10;
		 }
		 System.out.println("Revered number is  : " + rev);


	}

}
