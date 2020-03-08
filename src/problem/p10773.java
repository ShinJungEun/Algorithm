package problem;

import java.util.Scanner;
import java.util.Stack;

public class p10773 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		
		int k = input.nextInt();

		int n = 0;
		for(int i = 0; i < k; i++) {
			n = input.nextInt();
			if(n == 0) {
				st.pop();
			}
			else {
				st.push(n);
			}
		}
		
		int sum = 0;
		while(!st.isEmpty()) {
			sum += st.pop();
		}
		System.out.println(sum);
	}

}
