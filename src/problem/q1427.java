package problem;

import java.util.Scanner;

public class q1427 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		String sArr[] = str.split("");
		int arr[] = new int[sArr.length];
		for(int i = 0; i < sArr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		
		selectionSort(arr);
		
	}
	
	// 선택 정렬(Selection Sort)
	public static void selectionSort(int arr[]) {
		int min;
		for(int i = 0; i < arr.length - 1; i++) {
			min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min])  {
					min = j;
				}
			}
			swap(arr, i, min);
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
	
	public static void swap(int arr[], int a, int  b) {
		int tmp;
		tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
