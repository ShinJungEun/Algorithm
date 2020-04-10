package problem;

import java.util.Scanner;

public class q7568 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();	// 사람수
		int weight[] = new int[n];	// 몸무게
		int height[] = new int[n];	// 키
		int grade[] = new int[n];	// 덩치 등수
		for(int i = 0; i < n; i++) {
			weight[i] = input.nextInt();
			height[i] = input.nextInt();
			grade[i] = 1;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((weight[i] < weight[j]) && 
					(height[i] < height[j])) {
					grade[i]++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(grade[i] + " ");
		}
	}
}
