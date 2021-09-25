package week1.assignments;

public class StringOperations {
	/* 
	 * 3. Write a program to concatenate 2 strings.
4. Write a program to trim the String : " She sells sea shells on the sea shore ".
5. Write a program to replace character ‘P’ with ‘F’ in the String:
“Pan Pun Prank Pit Pat”
	 * */

	public static void main(String[] args) {
		String str1 = "Hello ";
		String str2 = "Everyone";
		//3. Write a program to concatenate 2 strings.
		
		System.out.println(str1 + str2);
		
		//Write a program to trim the String : " She sells sea shells on the sea shore ".
		
		String str =  " She sells sea shells on the sea shore ";
		System.out.println(str.trim());
		
		//Write a program to replace character ‘P’ with ‘F’ in the String:
		//“Pan Pun Prank Pit Pat”
		
		String givenStr = "Pan Pun Prank Pit Pat";
		String replacedStr = givenStr.replace('P', 'F');
		
		System.out.println(replacedStr);
		
		
	}

}
