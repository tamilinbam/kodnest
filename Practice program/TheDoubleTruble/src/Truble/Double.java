package Truble;

import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
	System.out.println("enter the value");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	System.out.println(doubleTheTruble(num));

	}
	public static int doubleTheTruble(int num)
	{
		return num*2;
	}
}
