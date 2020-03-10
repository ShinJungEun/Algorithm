package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2630 {

	public static int blue;
	public static int white;

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int n = Integer.parseInt(br.readLine());
		String arr[][] = new String[n][n];
		String s = "";
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			arr[i] = s.split(" ");
		}

		blue = 0;
		white = 0;
		func(arr, n, 0, 0);
		System.out.println(white);
		System.out.println(blue);

	}

	public static void func(String arr[][], int n, int x, int y) {
		boolean bCheck = true;
		boolean wCheck = true;
		for(int i = x; i < x+n; i++) {
			for(int j = y; j < y+n; j++) {
				if(arr[i][j].equals("1")) {
					wCheck = false;
				}
				else if(arr[i][j].equals("0")) {
					bCheck = false;
				}
			}
		}

		// 모든 종이 칸이 1인 경우
		if(bCheck == true) {
			blue++;
			return;
		}
		// 모든 종이 칸이 0인 경우
		if(wCheck == true) {
			white++;
			return;
		}

		// else
		func(arr, n/2, x, y);
		func(arr, n/2, x+n/2, y);
		func(arr, n/2, x, y+n/2);
		func(arr, n/2, x+n/2, y+n/2);
	}

}
