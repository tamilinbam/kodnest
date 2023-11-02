package journeyalanderf;

import java.util.Scanner;

public class journeyCalander {

		public static void main (String[]args)
		{
			Scanner scan = new Scanner (System.in);
			System.out.println("enter the speed and time in hours  :");
			double speed = scan.nextDouble();
			double time = scan.nextDouble();
			journey d1 = new journey();
			double res=d1.journeyalander (speed,time);
			System.out.println(res);
		}
}