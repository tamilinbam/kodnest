package grade;

import java.util.Scanner;

public class grade {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name: ");	
		String name = scan.next();
		System.out.println("enter your english mark: ");	
		int english = scan.nextInt();
		System.out.println("enter your maths mark :");	
		int maths = scan.nextInt();
		System.out.println("enter your science mark : ");	
		int science = scan.nextInt();
		System.out.println("enter your arts mark: ");	
		int arts = scan.nextInt();
		yourGrade n1 =new yourGrade(name,english,maths,science,arts);
		n1.yourName();
		n1.englishGrade();
		n1.mathsGrade();
		n1.scienceGrade();
		n1.artsGrade();
		
		
	}
}
