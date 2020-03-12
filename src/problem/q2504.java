package problem;

import java.util.Scanner;
import java.util.Stack;

public class q2504 {

	public static boolean check;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s = input.nextLine();
		s = s.replace(" ", "");
		s = s.replace("\n", "");
		String arr[] = s.split("");
		Stack<String> st = new Stack<>();

		check = true;
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("(") || arr[i].equals("[")) {
				st.push(arr[i]);
			}
			// 닫는 괄호 or 숫자
			else {
				// 괄호 조건이 맞지 않는 경우(비어있는 경우)
				if(st.isEmpty()) {
					error();
					break;
				}
				if(arr[i].equals(")")) {
					func(st, "(", "[", 2);
				}
				else if(arr[i].equals("]")) {
					func(st, "[", "(", 3);
				}
			}
		}
		tmp = 0;
		if(check) {
			while(!st.isEmpty()) {
				if(st.peek().equals("(") || st.peek().equals("[") || st.peek().equals(")") || st.peek().equals("]")) {
					if(check) {
						error();
						break;
					}
				}
				tmp += Integer.parseInt(st.pop());
			}
			if(check)
				System.out.println(tmp);
		}
	}

	public static void error() {
		if(check) {
			System.out.println("0");
		}
		check = false;
	}

	public static void func(Stack<String> st, String s1, String s2, int n) {
		int tmp = 0;
		// 괄호 조건이 맞지 않는 경우
		if(st.peek().equals(s2)) {
			error();
			return;
		}
		else if(st.peek().equals(s1)) {
			st.pop();
			st.push(Integer.toString(n));
		}
		// 숫자인 경우
		else {
			if(!st.isEmpty()) {
				tmp = Integer.parseInt(st.pop());
				if(!st.isEmpty()) {
					while(!st.isEmpty() && !st.peek().equals(s1)) {
						if(st.peek().equals(s2)) {
							error();
							return;
						}
						tmp += Integer.parseInt(st.pop());
					}
					if(check && !st.isEmpty()) {
						st.pop();
						tmp *= n;
						st.push(Integer.toString(tmp));
					}
				}
			}
		}
	}

}
