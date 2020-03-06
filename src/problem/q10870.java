package problem;

import java.util.Scanner;

// 피보나치 수열
public class q10870 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int n = input.nextInt();
		
		int result = fibo(n);
		System.out.println(result);
	}
	
	public static int fibo(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibo(n-1) + fibo(n-2);
	}

}
