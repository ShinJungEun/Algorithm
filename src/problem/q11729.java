package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q11729 {

	public static BufferedReader br;
	public static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int count = (int)Math.pow(2, n) - 1;
		bw.write(count + "\n");
		Hanoi(n, 1, 2, 3);

		bw.flush();
		bw.close();
		br.close();
	}

	public static void Hanoi(int n, int from, int mid, int to) throws IOException {
		if(n == 1) {
			bw.write(from + " " + to + "\n");
		}
		else {
			Hanoi(n - 1, from, to, mid);
			bw.write(from + " " + to + "\n");
			Hanoi(n - 1, mid, from, to);
		}
	}

}
