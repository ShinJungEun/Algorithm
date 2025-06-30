import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n = input.nextInt();
		String str = input.next();
		for(int i = 0; i < n; i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
