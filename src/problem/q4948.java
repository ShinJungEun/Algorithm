package problem;

import java.util.Scanner;

public class q4948 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		boolean arr[] = new boolean[246913];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		int count = 0;
		while(true) {
			n = input.nextInt();
			if(n == 0) {
				break;
			}
			
			count = 0;
			for(int i = 2; i*i <= 2*n; i++) {
				for(int j = i*i; j <= 2*n; j += i) {
					if(!arr[j])
						continue;
					arr[j] = false;
				}
			}
			
			for(int i = n+1; i <= 2*n; i++) {
				if(arr[i]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
