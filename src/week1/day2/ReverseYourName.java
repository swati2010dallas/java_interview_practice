package week1.day2;

public class ReverseYourName {

	public static void main(String[] args) {
		String myName = "Swati Mohanty";
		char[] myNameArray = myName.toCharArray();
		for(int i = myNameArray.length-1;i>=0;i--) {
			System.out.print(myNameArray[i]);
			
		}
		
	}

}
