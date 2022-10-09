import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		double print[] = new double[n];
		for(int i = 0; i < n; i++) {
			int k = input.nextInt();
			double arr[] = new double[k];

			int count = 0;
			double avg = 0.0;

			for(int j = 0; j < k; j++) {
				arr[j] = input.nextDouble();
			}
			avg = average(arr);
			for(int j = 0; j < k; j++) {
				if(arr[j] > avg)
					count++;
			}
			double per = ((double)(count)/(double)(k))*100;
			print[i] = per;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(String.format("%.3f", print[i]) + "%");
		}

	}

	public static double average(double[] arr) {
		double sum = 0.0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum/arr.length;
	}

}
