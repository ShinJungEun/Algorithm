package problem;

import java.util.Scanner;

public class q2609 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int gcd = gcd(n, m);
		int lcm = (m * n) / gcd;
		
		System.out.println(gcd);  	// 최대공약수
		System.out.println(lcm); 	// 최소공배수
		
	}
	
	// 유클리드 호제법(최대공약수 알고리즘)
	public static int gcd(int n, int m) {
		int small = 0;
		int big = 0;
		if(n > m) {
			small = m;
			big = n;
		}
		else {
			small = n;
			big = m;
		}
		int tmp = 0;
		
		while(small != 0) {
			tmp = big % small;
			big = small;
			small = tmp;
		}
		
		return big;
	}
}
