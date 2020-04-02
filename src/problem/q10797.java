package package;

import java.util.Scanner;

public class q10797 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int arr[] = new int[5];
		int count = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = input.nextInt();
			if(arr[i] == n) {
				count++;
			}
		}
		System.out.println(count);
	}

}
