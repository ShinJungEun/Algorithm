import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" "); // 주사위 배열
		
		int[] diceCount = new int[6]; // 주사위 나온 횟수
		Arrays.fill(diceCount, 0); // 초기화
		int max = 0;
		int maxIdx = -1;
		
		for(int i = 0; i < 3; i++) {
			int dice = Integer.parseInt(arr[i]) - 1;
			diceCount[dice] += 1;
			if(diceCount[dice] > max) {
				max = diceCount[dice];
				maxIdx = dice + 1;
			}
		}
		
		if(max == 1) { // 모두 다른 눈
			for(int i = 5; i >= 0; i--) {
				if(diceCount[i] > 0) {
					System.out.println((i + 1) * 100);
					break;
				}
			}
		} else if(max == 2) { // 같은 눈 2개
			System.out.println(1000 + maxIdx * 100);
		} else if(max == 3) { // 같은 눈 3개
			System.out.println(10000 + maxIdx * 1000);
		}
		
	}

}
