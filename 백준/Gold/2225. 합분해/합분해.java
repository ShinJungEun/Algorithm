import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		// dp[k][n]
		int dp[][] = new int[201][201];
		for(int i = 0; i <= n; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 1; i <= k; i++) {
			for(int j = 0; j <= n; j++) {
				for(int m = 0; m <= j; m++) {
					dp[i][j] += dp[i - 1][j - m];
					dp[i][j] %= 1000000000;
				}
			}
		}
		
		System.out.println(dp[k][n]);
	}

}
