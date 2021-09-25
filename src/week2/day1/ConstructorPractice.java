package week2.day1;

/* 
 * TODO - 4
1. Write a class
2. Create an object for the class where it should receive int and string as an arg
3. Call the constructor and check the default values for all the primitive data type
4. Create another class and prevent creating an object for the class
*/

public class ConstructorPractice {
	
public static int x;
public static String name;
public static boolean knowsJava;
public static float y;
public static double z;
public static char sex;
 
public ConstructorPractice(int age,String Name) {
	
	x=age;
	name = Name;
	
	System.out.println("Age is : " + age +"Name : " + name);
}

/*public static void main(String[] args) {
ConstructorPractice obj = new ConstructorPractice();
System.out.println(x);
System.out.println(name);
System.out.println(knowsJava);
System.out.println(y);
System.out.println(z);
System.out.println(sex);

	}
*/


}
