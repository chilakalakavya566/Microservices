package FunctionalInterface;

import java.util.Scanner;

public class TestBanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = sc.nextInt();
		Banking a = new Banking();
		try {
			a.withDraw(amount);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
		sc.close();
		

	}

}
