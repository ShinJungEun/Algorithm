import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	//	push X: 정수 X를 큐에 넣는 연산이다.
	//	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	//	size: 큐에 들어있는 정수의 개수를 출력한다.
	//	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	//	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	//	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Deque<String> q = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			String stackStr = br.readLine();
			String[] stackArr = stackStr.split(" ");
			switch(stackArr[0]) {
			case "push":
				q.add(stackArr[1]);
				break;
			case "pop":
				bw.write((q.size() > 0 ? q.remove() : "-1") + "\n");
				break;
			case "size":
				bw.write(q.size() + "\n");
				break;
			case "empty":
				bw.write((q.isEmpty() ? "1" : "0") + "\n");
				break;
			case "front":
				bw.write((q.size() > 0 ? q.peek() : "-1") + "\n");
				break;
			case "back":
				bw.write((q.size() > 0 ? q.peekLast() : "-1") + "\n");
				break;
			}
		}
		bw.flush();
        bw.close();
	}

}
