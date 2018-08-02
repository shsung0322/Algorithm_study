package level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
문제
예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N이 주어진다. N은 항상 3*2^k 수이다. (3, 6, 12, 24, 48, ...) (k<=10)

출력
첫째 줄부터 N번째 줄까지 별을 출력한다.
*/

public class Step3 {

	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
								new OutputStreamWriter(System.out));
		
		int line;
		
		try {
			
			line = Integer.valueOf(br.readLine());
			
			for(int i=0; i<line; i++){
				for(int j=0; j<line*2; j++){
					bw.write("*");
				}
				bw.write("\n");
			}
		
			bw.flush();
			bw.close();
			br.close();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
