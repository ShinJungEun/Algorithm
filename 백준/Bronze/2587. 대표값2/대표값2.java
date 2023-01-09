import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		int[] numArr = new int[5];
		int avg = 0; // 평균값
		int mid = 0; // 중앙값
		for (int i = 0; i < 5; i++) {
			numArr[i] = input.nextInt();
			avg += numArr[i];
		}
		avg /= 5;
		Arrays.sort(numArr);
		mid = numArr[2];
		System.out.println(avg);
		System.out.println(mid);
	}
}