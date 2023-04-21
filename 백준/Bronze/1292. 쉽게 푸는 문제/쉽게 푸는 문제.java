import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int a = input.nextInt();
		int b = input.nextInt();
		
		int[] arr = new int[1001];
		arr[0] = 0;
		
		int num = 1;
		int idx = 1;
		while(true) {
			for(int i = 0; i < num; i++) {
				arr[idx] = num;
				if(idx == 1000) {
					break;
				}
				idx++;
			}
			if(idx == 1000) {
				break;
			}
			num++;
		}
		
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
