import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] sumArr = new int[n+1];
		
		st = new StringTokenizer(br.readLine()); // 배열 읽기 
		sumArr[0] = 0;
		for(int i = 1; i <= n; i++) {
			// 누적합 저장
			sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		// 더하기
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int startIdx = Integer.parseInt(st.nextToken());
			int endIdx = Integer.parseInt(st.nextToken());
			
			bw.write((sumArr[endIdx] - sumArr[startIdx-1]) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}