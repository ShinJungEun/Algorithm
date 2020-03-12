package problem;

import java.util.Scanner;

public class q2525 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();	// 시
		int m = input.nextInt();	// 분
		int n = input.nextInt(); 	// 걸리는 시간
		
		int count = 0;
		if(m + n < 60) {
			System.out.println(h + " " + (m + n));
		}
		else if((m + n) == 60) {
			if((h + 1) < 24) {
				System.out.println((h + 1) + " 0");
			}
			else if((h + 1) == 24) {
				System.out.println("0 0");
			}
		}
		else if((m + n) > 60) {
			count = (m + n) / 60;
			m = (m + n) - count * 60;
			if((h + count) < 24) {
				System.out.println((h + count) + " " + m);
			}
			else if((h + count) >= 24) {
				System.out.println((h + count - 24) + " " + m);
			}
		
		}
		
	}

}
