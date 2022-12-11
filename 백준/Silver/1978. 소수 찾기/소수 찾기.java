import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			int num = input.nextInt();
			count = count + (isPrimeNum(num) ? 1 : 0);
		}
		
		System.out.println(count);
	}

	public static boolean isPrimeNum(int num) {
		boolean flag = true;
		
		if(num < 2) {
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
