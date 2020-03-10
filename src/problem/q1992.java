package problem;

import java.util.Scanner;

public class q1992 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String arr[][] = new String[n][n];
		for(int i = 0; i < n; i++) {
			arr[i] = input.next().split("");
		}
		
		func(arr, n, 0, 0);

	}
	
	public static void func(String arr[][], int n, int x, int y) {
		boolean zCheck = true;	// 0검사
		boolean oCheck = true;	// 1검사
		for(int i = x; i < x+n; i++) {
			for(int j = y; j < y+n; j++) {
				if(arr[i][j].equals("0")) {
					oCheck = false;
				}
				else if(arr[i][j].equals("1")) {
					zCheck = false;
				}
			}
		}
		if(zCheck == true) {
			System.out.print("0");
			return;
		}
		
		if(oCheck == true) {
			System.out.print("1");
			return;
		}
		
		// else
		System.out.print("(");
		func(arr, n/2, x, y);
		func(arr, n/2, x, y+n/2);
		func(arr, n/2, x+n/2, y);
		func(arr, n/2, x+n/2, y+n/2);
		System.out.print(")");
		
	}

}
