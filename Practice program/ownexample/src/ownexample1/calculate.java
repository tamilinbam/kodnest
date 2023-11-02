package ownexample1;

import java.util.Scanner;

public class calculate {
	public static void main (String[]args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter the value if a: ");
		int a= scan.nextInt();
		System.out.println("enter the value if b: ");
		int b= scan.nextInt();
		System.out.println(calculateSquare( a ,  b) );
		System.out.println(calculateCube( a,b ));
		System.out.println(calculateSum(a, b ) );
	}
	public static int calculateSquare(int a , int b) {
		return (a*b)*(a*b);
	}
	public static int calculateCube(int a,int b ) {
		return (a*b)*(a*b)*(a*b);
	}
	public static int calculateSum(int a, int b ) {
		return a+b;
	}
}
