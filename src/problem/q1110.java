package problem;
import java.util.Scanner;

public class q1110 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int a = n / 10;
		int b = n % 10;

		int count = 1;
		while(true) {
			int k = a + b;
			a = b;
			b = k;
			if(b >= 10)
				b %= 10;

			if((a * 10 + b) == n)
				break;

			count++;
		}

		System.out.println(count);

	}

}