package problem;

import java.util.Scanner;

public class q1699 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		int[] dp = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			dp[i] = i;
			for(int j = 1; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i-(j*j)] + 1);
			}
		}
		
		System.out.println(dp[n]);
	}

}
