import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		// Arrays.sort(arr);
		quickSort(arr, 0, n - 1);
		System.out.println(arr[0] * arr[n - 1]);
	}

	public static void quickSort(int arr[], int start, int end) {
		// 원소가 한 개인 경우
		if(start >= end) {
			return;
		}

		int pivot = start;
		int left = start + 1;
		int right = end;
		int tmp;

		while(left <= right) {
			while(left <= end && arr[left] <= arr[pivot]) {
				left++;
			}
			while(right > start && arr[right] >= arr[pivot]) {
				right--;
			}
			
			if(left > right) {
				tmp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = tmp;
			}
			else {
				tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
			}
		}
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
	
	}

}
