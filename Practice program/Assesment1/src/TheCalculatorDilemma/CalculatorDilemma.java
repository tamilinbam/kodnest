package TheCalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		
		calculation();
		
	}
		
		public static void calculation() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the value of number 1 : ");
			double number1 = scan.nextDouble();
			System.out.println("Enter the value of number 2 : ");
			double number2 = scan.nextDouble();
			System.out.println("Enter the operator : ");
			char operation  = scan.next().charAt(0);			
		switch (operation) {
			case '+' :
				System.out.println(number1+number2);
				break;
			case '-' :
				System.out.println(number1-number2);
				break;
			case '*' :
				System.out.println(number1*number2);
				break;
			case '/' :
				System.out.println(number1/number2);
				break;
			case '%' :
				System.out.println(number1%number2);
				break;
		}
	}
	

}
