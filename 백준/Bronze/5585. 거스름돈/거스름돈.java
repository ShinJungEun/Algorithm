import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int amount = input.nextInt();
		int[] coinArr = {500, 100, 50, 10, 5, 1}; // 잔돈 리스트
		
		int result = 0;
		int calcAmount = 1000 - amount;
		for(int i = 0; i < coinArr.length; i++) {
			if(calcAmount == 0) {
				break;
			}
			while(true) {
				int count = calcAmount / coinArr[i];
				if(count == 0) {
					break;
				}
				result += count;
				calcAmount -= count * coinArr[i];
			}
		}
		System.out.println(result);
	}

}