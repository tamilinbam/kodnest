package convertion;

import java.util.Scanner;

public class TemperatureConvertion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature converation tool !...");
		Scanner scan= new Scanner(System.in);
		System.out.println("choose the option : ");
		System.out.println("1. celsius To Fahrenheit  ");
		System.out.println("2. fahrenheitToCelsius ");
		int choise = scan.nextInt();
		
		if (choise==1) {
		celsiusToFahrenheit();
		}
		else if(choise == 2) {
		fahrenheitToCelsius();
		}
		else
		{
			System.out.println("enter the valid option : ");
		}
		}
		
	
		public static void celsiusToFahrenheit() {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the value of Celsius : ");
			double Celsius = scan.nextDouble();
			System.out.println("Temperatur in fahrenheit "+ (Celsius * 9/5) + 32);
		}
        public static void fahrenheitToCelsius() {
        	Scanner scan= new Scanner(System.in);
        	System.out.println("Enter the value of Fahrenheit : ");
			double Fahrenheit = scan.nextDouble();
        	System.out.println("Temperature in celsius "+(Fahrenheit - 32) * 5/9);
        }
		
	

}
