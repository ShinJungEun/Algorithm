import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int count = 0;
		while(n > 0) {
			if(n % 2 == 1) {
				count++;
			}
			n /= 2;
		}
		System.out.println(count);
	}

}
