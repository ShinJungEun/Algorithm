package problem;

import java.util.Scanner;

public class 5543 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		int min = 2001;
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		sum += min;
		min = 2001;
		for(int i = 3; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		sum += min;
		sum -= 50;
		
		System.out.println(sum);
		
	}

}
