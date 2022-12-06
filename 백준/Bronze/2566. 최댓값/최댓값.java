import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0; // 행
		int n = 0; // 열
		int max = 0; // 최댓값
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int num = input.nextInt();
				if(num > max) {
					max = num;
					m = i;
					n = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((m+1) + " " + (n+1));

	}
}