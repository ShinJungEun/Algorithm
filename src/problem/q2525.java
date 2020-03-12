package problem;

import java.util.Scanner;

public class q2525 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int h = input.nextInt();	// 시
		int m = input.nextInt();	// 분
		int n = input.nextInt(); 	// 걸리는 시간
		
		time(h, m, n);
	}

	public static void time(int h, int m, int n) {
		int count  = (m + n) / 60;
		m = (m + n) % 60;
		h = (h + count) % 24;
		System.out.println(h + " " + m);
	}

}
