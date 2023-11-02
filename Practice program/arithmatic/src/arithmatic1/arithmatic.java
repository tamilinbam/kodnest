package arithmatic1;

import java.util.Scanner;

public class arithmatic {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt(); 
		System.out.println(subtractNumbers(num1,num2)+" "+multiplyNumbers(num1, num2)+" "+divideNumbers( num1,num2)+" "+ findRemainder(num1,num2));
	}
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1,int num2)
	{
		return num1*num2;
	}
	public static int divideNumbers(int num1,int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2)
	{
		return num1%num2;
	}
}
