package Assignments;
import java.util.Scanner;

public class WeeksProgram {
	public static void main(String[] args) {
		int value;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value between 1 to 7");
		value=sc.nextInt();
		System.out.println("Enter string");
		
		
		switch(value) {
		default : System.out.println("Check the value entered");
		case 1: System.out.println("It is monday"); break;
		case 2: System.out.println("It is tuesday"); break;
		case 3: System.out.println("It is wednesday"); break;
		case 4: System.out.println("It is thursday"); break;
		case 5: System.out.println("It is friday"); break;
		case 6: System.out.println("It is saturday"); break;
		case 7: System.out.println("It is sunday"); break;
		}
		sc.close();
		

	}

}
