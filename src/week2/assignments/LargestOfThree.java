package week2.assignments;

import java.util.Scanner;

/*
 * 1. Write a program to print the largest of three numbers using if-else if
2.
3. Write a program to check whether the no. entered from user is positive or negative.*/

public class LargestOfThree {
 Scanner sc = new Scanner(System.in);
  int num1,num2,num3;
 
	public  void findLargestNumber() {
		System.out.println("Enter 1st Number :");
		num1= sc.nextInt();
		System.out.println("Enter 2nd Number :");
		num2= sc.nextInt();
		System.out.println("Enter 3rd Number :");
		num3= sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 +" is Largest");
		}else if(num2>num3) {
			System.out.println(num2 +" is Largest");
		}else
			System.out.println(num3 +" is Largest");
			
	
	}

}
