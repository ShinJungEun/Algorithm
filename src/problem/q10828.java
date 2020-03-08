package problem;

import java.util.Scanner;
import java.util.Stack;

public class q10828 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();

		int n = input.nextInt();
		String action = "";
		int m = 0;
		for(int i = 0; i < n; i++) {
			action = input.next();
			if(action.equals("push")) {
				m = input.nextInt();
				st.push(m);
			}
			else if(action.equals("pop")) {
				if(st.isEmpty())
					System.out.println("-1");
				else
					System.out.println(st.pop());
			}
			else if(action.equals("top")) {
				if(st.isEmpty())
					System.out.println("-1");
				else
					System.out.println(st.peek());
			}
			else if(action.equals("size")) {
				System.out.println(st.size());
			}
			else if(action.equals("empty")) {
				if(st.isEmpty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
		}
	}

}
