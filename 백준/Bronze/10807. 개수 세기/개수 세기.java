import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		int num = input.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				result++;
			}
		}
		System.out.println(result);
	}

}
