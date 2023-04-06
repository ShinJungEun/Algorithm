import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> strMap = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++) {
			strMap.put(br.readLine(), i);
		}
		
		// 검사
		int count = 0;
		for(int i = 0; i < M; i++) {
			if(strMap.containsKey(br.readLine())) {
				count++;
			}
		}
		bw.write(Integer.toString(count));
		br.close();
		bw.close();
	}

}