package problem;

import java.util.Scanner;

public class q2440 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
