package LogicalOperationValidation;


import java.util.Scanner;

public class LogicalOperationValidation  {

	public static void main(String[] args) {
		System.out.println(isValidInput());

	}
	public static boolean isValidInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("is input valid (true/false): ");
		boolean a = scan.nextBoolean();
		System.out.print("Does input meet a certain condition (true/false): ");
		boolean b = scan.nextBoolean();
		return a&&b;
		
	}

}



