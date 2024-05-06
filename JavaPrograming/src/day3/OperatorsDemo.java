package day3;

public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 20, b = 10;
		System.out.println("sum of a and b is :" + (a + b));// addition

		System.out.println("Diff of a and b is :" + (a - b));// subsration

		System.out.println("multiplecation of a and b is :" + (a * b));// Multiplication

		System.out.println("divetion of a and b is :" + (a / b)); // grater than or equal

		System.out.println("modul  of a and b is :" + (a % b));// Module

		System.out.println("a graterthan b :" + (a > b));// grater than

		System.out.println("a lessthan  b :" + (a < b));// less than

		System.out.println("a  lesssthan or equal to  b :" + (a <= b));// less than or equal to

		System.out.println("a graterthan or equal b is :" + (a >= b));// grater than or equal b

		System.out.println("a equal to b :" + (a == b));// equal to 
 
		System.out.println("a not equalt to b:" + (a != b)); 
		
		
		boolean x= true,y=false;
		System.out.println(x&&y);
		
		System.out.println(x||y);
		System.out.println(!y);
		
		boolean b1= 10>20;
		
		boolean b2 = 20>10;
		
		System.out.println("to chech the boolean :" + (b1&&b2));
		System.out.println("to chech the boolean : " + (b1||b2));
		
		
		
	}

}
