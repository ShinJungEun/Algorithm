package problem;

import java.util.Scanner;

public class q2506 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int score = 0;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				if(count != 0) {
					count++;
					score += count;
				}
				else {
					score += 1;
					count++;
				}
			}
			else if(arr[i] == 0) {
				count = 0;
			}
		}
		
		System.out.println(score);
	}

}
