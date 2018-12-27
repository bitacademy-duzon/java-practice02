package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("금액: ");
		num = sc.nextInt();

		if (num < 0) {
			num = 0;
		}
		
		int[] changes = { 
				num / 50000,
				(num % 50000) / 10000,
				((num % 50000) % 10000) / 5000,
				(((num % 50000) % 10000) % 5000) / 1000,
				((((num % 50000) % 10000) % 5000) % 1000) / 500,
				(((((num % 50000) % 10000) % 5000) % 1000) % 500) / 100,
				((((((num % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50,
				((((((num % 50000) % 10000) % 5000) % 1000) % 500) % 50) / 10,
				(((((((num % 50000) % 10000) % 5000) % 1000) % 500) % 50) % 10) / 5,
				((((((((num % 50000) % 10000) % 5000) % 1000) % 500) % 50) % 10) % 5) / 1
		};
		
		for (int i = 0; i < MONEYS.length; i++) {
			System.out.println(MONEYS[i] + "원 : " + changes[i] + "개");
		}
	}

}
