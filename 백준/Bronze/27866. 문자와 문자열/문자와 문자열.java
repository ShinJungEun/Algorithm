import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int s = input.nextInt();
		
		System.out.println(str.charAt(s-1));

	}

}
