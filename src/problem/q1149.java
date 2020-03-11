package problem;

import java.util.Scanner;

// RGB 거리(DP)
public class q1149 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int dp[][] = new int[n+1][3];
		for(int i = 1; i <= n; i++) {
			dp[i][0] = input.nextInt();		// R
			dp[i][1] = input.nextInt();		// G
			dp[i][2] = input.nextInt(); 	// B
		}
				
		for(int i = 2; i <= n; i++) {
			dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] += Math.min(dp[i - 1][0], dp[i - 1][1]);
		}
		
		int min = Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
		System.out.println(min);
	}

}
