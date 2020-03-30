package problem;

import java.util.Scanner;

public class q2003 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		int count = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = i; j < n; j++) {
				sum += arr[j];
				if(sum == m) {
					count++;
					sum = 0;
					break;
				}
			}
		}
		System.out.println(count);
	} 

}
