import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		int count = 0;
		int max = 0;
		for(int i = n - 1; i >= 0 ; i--) {
			if(arr[i] > max) {
				max = arr[i];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
