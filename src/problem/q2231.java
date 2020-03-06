package problem;

import java.util.Scanner;

public class q2231 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int sum = 0;
		boolean check = false;
		
		int tmp = 0;
		for(int i = 1; i < n; i++) {
			sum = 0;
			tmp = i;
			sum += tmp;
			sum += (tmp % 10);
			while(tmp / 10 >= 1) {
				tmp /= 10;
				sum += (tmp % 10);
			}
			if(sum == n) {
				System.out.println(i);
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println("0");
		}
		
	}

}
