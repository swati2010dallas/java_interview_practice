package week1.day2;

public class ReverseTheWordsInAString {

	public static void main(String[] args) {
		String str = "welcome to Selenium";
		
		//op- "Selenium to welcome"
		
		String[] split= str.split(" ");
		
		for(int i = split.length-1;i>=0;i--) {
			System.out.print(split[i] + " ");
			
		}
		
		
	}

}
