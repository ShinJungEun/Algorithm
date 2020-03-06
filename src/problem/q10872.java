package problem;

import java.util.Scanner;

// 팩토리얼 문제
public class q10872 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int result = rFactorial(n);
		System.out.println(result);
	}

	// 재귀
	public static int rFactorial(int n) {	
		if(n > 1)
			return rFactorial(n - 1) * n;
		else
			return 1;
	}
	
	// for문
	public static int fFactorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
