import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int sum = 0;
		
		String st = input.next();
		
		for(int i = 0; i < n; i++) {
			sum += (st.charAt(i) - 48);
		}
		System.out.println(sum);
	}

}
