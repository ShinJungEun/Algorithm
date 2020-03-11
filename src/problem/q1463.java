package problem;

import java.util.Scanner;

public class q1463 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[1000001];
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 1;

		for(int i = 4; i <= n; i++) {
			if(i % 3 == 0 && i % 2 == 0) {
				arr[i] = Math.min(1 + arr[i - 1], 
							Math.min(1 + arr[i / 3], 1 + arr[i / 2]));
			}
			else if(i % 2 == 0) {
				arr[i] = Math.min(1 + arr[i - 1], 1 + arr[i / 2]);
			}
			else if(i % 3 == 0) {
				arr[i] = Math.min(1 + arr[i - 1], 1 + arr[i / 3]);
			}
			else {			// 1을 빼는 경우
				arr[i] = 1 + arr[i - 1];
			}
		}
		System.out.println(arr[n]);
	}

}
