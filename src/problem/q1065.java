package problem;
import java.util.Scanner;

public class q1065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int count = 0;

		if(n < 100)
			System.out.println(n);
		else {
			count = 99;
			for(int i = 100; i <= n; i++)
				count += checkNum(i);
			System.out.println(count);
		}
	}

	public static int checkNum(int num) {
		int arr[] = new int[3];
		arr[0] = num / 100;
		arr[1] = (num / 10) % 10;
		arr[2] = num % 10;

		if(arr[1] * 2 == arr[0] + arr[2]) 
			return 1;

		return 0;
	}

}
