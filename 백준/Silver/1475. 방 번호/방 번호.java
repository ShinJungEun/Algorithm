import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.next();
		int count = 0;

		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		for(int i = 0; i < str.split("").length; i++) {
			arr[Integer.parseInt(str.substring(i,i+1))]++;
		}

		for(int i = 0; i < arr.length; i++) {
			if(i == 6 || i == 9) {
				int tmp = arr[6] + arr[9];
				if(tmp % 2 == 0) {
					tmp /= 2;
				}
				else {
					tmp = tmp / 2 + 1;
				}
				if(count < tmp) {
					count = tmp;
				}
				else {
					continue;
				}
			}
			else {
				if(count < arr[i]) {
					count = arr[i];
				}
			}
		}
		System.out.println(count);

	}

}
