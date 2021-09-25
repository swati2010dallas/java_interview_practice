package week1.assignments;
/* 
 * Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 
 * */
public class DupliatesInAnArray {

	public static void main(String[] args) {
		int myArray[] = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		for(int i=0;i<= myArray.length -1;i++) {
			
			for(int j=0;j<=i;j++) {
//				System.out.println(ele);
				if(j != i && myArray[j]==myArray[i]) {
					System.out.println("Duplicate element found : " + myArray[j]);
					break;
					}
				
			}
			
		}
		

	}

}
