import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Stack<String> st = new Stack<String>();
		for(int i = 0; i < n; i++) {
			String stackStr = br.readLine();
			String[] stackArr = stackStr.split(" ");
			switch(stackArr[0]) {
			case "push":
				st.push(stackArr[1]);
				break;
			case "pop":
				bw.write((st.size() > 0 ? st.pop() : "-1") + "\n");
				break;
			case "size":
				bw.write(st.size() + "\n");
				break;
			case "empty":
				bw.write((st.isEmpty() ? "1" : "0") + "\n");
				break;
			case "top":
				bw.write((st.size() > 0 ? st.peek() : "-1") + "\n");
				break;
			}
		}
		bw.flush();
        bw.close();
	}

}