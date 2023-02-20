import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// n! = 1x2x3x ... x (n-1) x n
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println(factorial(num));

	}
	
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
