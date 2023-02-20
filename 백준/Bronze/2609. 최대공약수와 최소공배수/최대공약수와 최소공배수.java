import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 유클리드 호제법
		 * 두 자연수 A, B에 대해 (A > B) A를 B로 나눈 나머지를 R이라고 합시다.
		 * 이때 A와 B의 최대공약수는 B와 R의 최대공약수와 같습니다.
		*/
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int gcdNum, lcmNum;
		if(a >= b) {
			gcdNum = gcd(a, b);
		} else {
			gcdNum = gcd(b, a);
		}
		lcmNum = a * b / gcdNum;
		
		System.out.println(gcdNum + " " + lcmNum);
	}
	
	public static int gcd(int a, int b) {
		if(a % b == 0) {
			return b;
		} else {
			return gcd(b, (a % b));
		}
	}

}