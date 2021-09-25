package week1.assignments;

public class AverageOfNumbersInArray {
/*
 * *1. Java Program to Calculate average of numbers using Array
Example:
values [] = 1, 2,3 4, 5
average = 3
 */
	public static void main(String[] args) {
		int values[] = {1,2,3,4,5};
		int avg,sum=0;
		for(int i=0;i<=values.length -1;i++) {
			sum= sum + values[i];
		}
		
		System.out.println(sum);
		avg = sum/5;
		
		System.out.println( "Average of Array: " + avg);

	}

}
