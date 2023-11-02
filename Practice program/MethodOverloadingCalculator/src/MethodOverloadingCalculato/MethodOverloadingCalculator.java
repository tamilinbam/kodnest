package MethodOverloadingCalculato;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the first value : ");
		int a  = scan.nextInt();
		System.out.println("enter the second value : ");
		int b = scan.nextInt();
		System.out.println("enter the operator +,-,*,/ : ");
		char c = scan.next().charAt(0);
		calculate(a,c,b);
		
	}
	public static void calculate(int a,char c ,int b) {
		switch (c) {
		case '+':
			System.out.println(a+b);
			break;
		}
	}
	public static void calculate(int a,char c , int b) {
		switch (c) {
		case '-':
			System.out.println(a-b);
			break;
		}
		
	}
	public static void calculate(int a,char c , int b) {
		switch (c) {
		case '*':
			System.out.println(a*b);
			break;
		}
	}
	public static void calculate(int a,char c , int b) {
		switch (c) {
		case '/':
			System.out.println(a/b);
			break;
		}
	}


}
