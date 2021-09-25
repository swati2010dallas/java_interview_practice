package week1.assignments;

import java.util.Scanner;

/*Find the sum of digits
Example:
int n = 1234;
logic
----
digit = n%10 --4 3 2
sum = sum+digit 4 7 13
   123 12 1
output: 10*/

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("number is : " + num);
		int digit,sum =0;
		 while(num >0) {
			 digit = num%10;
			 sum = sum +digit;
			 num= num/10;
		 }
		 System.out.println("Sum of digits : " + sum);

	}

}
