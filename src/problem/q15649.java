package problem;

import java.util.Scanner;

//조건에 맞는 수열 중복X 구하기
public class q15649 {

	public static int n;
	public static int m;
	static Boolean[] check = new Boolean[9];
	static int[] list = new int[9];
			
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();		// 1~n까지 자연수 중
		m = input.nextInt();		// 중복 없이 m개를 고른 수열
		
		for(int i = 0; i < 9; i++) {
			check[i] = false;
		}
		
		dfs(0);
	}
	
	public static void dfs(int dep) {
		if(dep == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(list[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(check[i] == true) {
				continue;
			}
			list[dep] = i;
			check[i] = true;
			dfs(dep+1);
			check[i] = false;			
		}
	}

}
