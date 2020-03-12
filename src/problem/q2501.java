package problem;

import java.util.ArrayList;
import java.util.Scanner;

// 약수 구하기
public class q2501 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();	// k번째로 작은 약수를 구하기
		
		ArrayList<Integer> div = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if((n % i) == 0) {
				div.add(i);
			}
		}
		if(div.size() >= k) {
			System.out.println(div.get(k - 1));
		}
		else {
			System.out.println("0");
		}
	}

}
