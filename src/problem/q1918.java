package problem;

import java.util.Scanner;
import java.util.Stack;

public class q1918 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		String[] arr = str.split("");
		
		Stack<String> st = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("(")) {
				st.add(arr[i]);
			}
			else if(arr[i].equals(")")) {
				while(!st.peek().equals("(")) {
					System.out.print(st.pop());
				}
				st.pop();
			}
			else if(priority(arr[i]) >= 1) {
				// 연산자인 경우
				while(!st.isEmpty() && 
					priority(arr[i]) <= priority(st.peek())) {
					System.out.print(st.pop());
				}
				st.add(arr[i]);
			}
			else {
				// 문자
				System.out.print(arr[i]);
			}
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}
	
	// 우선순위
	public static int priority(String str) {
		if(str.equals("*") || str.equals("/")) {
			return 2;
		}
		else if(str.equals("+") || str.equals("-")) {
			return 1;
		}
		else {
			// "("인 경우
			return 0;
		}
	}

}
