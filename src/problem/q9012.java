package problem;

import java.util.Scanner;
import java.util.Stack;

public class q9012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String str = "";
		for(int i = 0; i < n; i++) {
			str = input.next();
			System.out.println(vps(str));
		}
	}
	
	public static String vps(String str) {
		Stack<String> st = new Stack<>();
		boolean check = true;
		for(int i = 0; i < str.split("").length; i++) {
			if(str.charAt(i) == '(') {
				st.push("(");
			}
			else if(str.charAt(i) == ')') {
				if(!st.isEmpty()) {
					st.pop();
				}
				else {
					check = false;
					break;
				}
			}
		}
		if(!st.isEmpty()) {
			check = false;
		}
		
		if(check) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
