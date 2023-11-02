package temperatureConverterrr;

import java.util.Scanner;

public class converter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the temperature in farenheit :");
		Double f1= scan.nextDouble();
		scan.close();
		calculator c1 = new calculator();
		double res = c1.temconvertor( f1);
		System.out.println(res);
	}

}
