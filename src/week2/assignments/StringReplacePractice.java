package week2.assignments;

/*
 * How to remove characters from the first String which are present in the second String?
 For example, if the first String "India is great" and second String is "in" then the output should be "da s great"

 * */
public class StringReplacePractice {
	static String str1 = "India is great";
	static char charStr1[] = str1.toCharArray();
	static String str2 = "In";
	static char charStr2[] = str2.toCharArray();

	public static void main(String[] args) {

		for (char c : charStr2) {

			str1 = str1.replace(c, ' ');
		}

		System.out.println(str1);
		System.out.println(str2);

	}

}
