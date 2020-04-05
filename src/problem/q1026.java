package problem;

import java.util.Scanner;

public class q1026 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = input.nextInt();
		}
		for(int i = 0; i < n; i++) {
			arr2[i] = input.nextInt();
		}
		aSort(arr1);
		dSort(arr2);
		
		int minSum = 0;
		for(int i = 0; i < n; i++) {
			minSum += (arr1[i] * arr2[i]);
		}
		System.out.println(minSum);
	}

	// 오름차순 정렬
	public static void aSort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while((j >= 0) && (key < arr[j])) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	// 내림차순 정렬
	public static void dSort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while((j >= 0) && (key > arr[j])) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
