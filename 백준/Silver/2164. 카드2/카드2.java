import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(q.size() > 1) {
			q.remove();
			q.offer(q.poll());
		}
		System.out.println(q.poll());
		
	}

}
