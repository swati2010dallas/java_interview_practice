package week1.day1;

public class PrintFriendsNameInReverse {

	public static void main(String[] args) {
		String[] friendNames = {"Upasna","Lucky","Amita","Vyoma","Sonam"};
		
		System.out.println("Print in reverse order :");
		for(int i=friendNames.length -1;i>= 0;i--) {
			System.out.println(friendNames[i]);
		}
		

	}

}
