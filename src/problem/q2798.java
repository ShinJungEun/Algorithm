package problem;

import java.util.Scanner;

public class q2798 {
	
	public static int n;	// 카드의 개수
	public static int m;	// 만들어야할 수
	public static int arr[];	// 카드
	public static int list[] = new int[3];	// 더할 카드 3장
	public static boolean check[];	// arr의 index로 check
	public static int max;	// m에 가까운 카드의 합

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();	
		m = input.nextInt();	
		arr = new int[n];
		check = new boolean[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			check[i] = false;
		}
		max = 0;
		
		dfs(0);
		System.out.println(max);
	}
	
	public static void dfs(int dep) {
		int sum = 0;
		if(dep == 3) {
			for(int i = 0; i < 3; i++) {
				sum += list[i];
			}
			if((sum > max) && (sum <= m)) {
				max = sum;
			}
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(check[i] == true) {
				continue;
			}
			list[dep] = arr[i];
			check[i] = true;
			dfs(dep+1);
			check[i] = false;
		}
	}

}
