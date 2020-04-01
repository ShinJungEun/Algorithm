package problem;

import java.util.Arrays;
import java.util.Scanner;

public class q10798 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = "";
		String arr[][] = new String[5][15];
		
		for(String[] row: arr) {
			Arrays.fill(row, "");		// 배열 초기화
		}
		
		for(int i = 0; i < 5; i++) {
			str = input.next();
			String strArr[] = new String[str.split("").length];
			strArr = str.split("");
			for(int j = 0; j < strArr.length; j++) {
				arr[i][j] = strArr[j];
			}
		}

		for(int j = 0; j < 15; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i][j]);
			}
		}
	}

}
