package bitwiseoperater;
import java.util.Scanner;
public class bitwiseSwapper {
	  
	    public static void main(String[] args) {
	        swapUsingBitwise();
	    }
	    public static void swapUsingBitwise() {
	        // Swapping using bitwise XOR
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first integer: ");
	        int first = scanner.nextInt();

	        System.out.print("Enter the second integer: ");
	        int second = scanner.nextInt();
	        
	        first = first ^ second;
	        second = first ^ second;
	        first =  first ^ second;

	        System.out.println("After swapping: First = " +first+ ", Second = " + second);
	    }

	}


	


