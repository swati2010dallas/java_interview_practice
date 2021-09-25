package week2.assignments;

import java.util.Scanner;

//Write a program to display prime numbers between two numbers where you get the 2 inputs
//for the range, from the user.

public class PrimeNumberWithinARange {
	Scanner sc = new Scanner(System.in);
	int startingNum, endingNum, num;

	public void findPrimeNumbers() {
		System.out.println("Enter starting Number :");
		startingNum = sc.nextInt();

		System.out.println("Enter ending Number :");
		endingNum = sc.nextInt();

		for (int i = startingNum; i <= endingNum; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i - 1; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;

				}
				

			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}
