package problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 별 찍기
public class q2447 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		print(n);

		bw.flush();
		bw.close();

	}

	public static void print(int n) throws IOException {
		if(n == 1) {
			System.out.println("*");
		}
		else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					divPrint(i, j);
				}
				bw.write("\n");
			}
		}
	}
	public static void divPrint(int di, int dj) throws IOException {


		while(di != 0) {
			if(di % 3 == 1 && dj % 3 == 1) {
				bw.write(" ");
				return;
			}
			di /= 3;
			dj /= 3;
		}
		bw.write("*");;
	}

}
