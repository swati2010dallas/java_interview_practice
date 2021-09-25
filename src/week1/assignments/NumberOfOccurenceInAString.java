package week1.assignments;

public class NumberOfOccurenceInAString {

	public static void main(String[] args) {
		// Find no.of 'a' in the string "amazon India"
		
		String str= "amazon India";
		char[] findChars = str.toCharArray();
		
		int count=0;
		
		for(char c:findChars) {
			if(c=='a'){
				count++;
			}
					
		}
		
		System.out.println("No of 'a' in the given string is : " + count);
		

	}

}
