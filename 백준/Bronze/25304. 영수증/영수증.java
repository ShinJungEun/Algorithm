import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inputAmt = input.nextInt();
		int n = input.nextInt();
		
		int totalAmt = 0;
		for(int i = 0; i < n; i++) {
			totalAmt += input.nextInt() * input.nextInt(); 
		}
		if(inputAmt == totalAmt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
