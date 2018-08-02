package level5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
문제
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수(Ex)135)라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
*/

public class Step2 {
	
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
								new OutputStreamWriter(System.out));
		
		try {
			
			int cnt = 0;
			int n = Integer.valueOf(br.readLine());
			
			for(int i = 1; i<=n; i++){
				
				if(checkNum(i)) cnt++;
			}
			
			bw.write(String.valueOf(cnt));

			if(bw!=null) bw.close();
			if(br!=null) br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean checkNum(int n){
		
		if(n>=100){
		
			int th = n/1000;
			n = n%1000;
			int h = n/100;
			n = n%100;
			int t = n/10;
			n = n%10;
		
			if(th > 0) {
				return checkData(th-h, h-t, t-n);
			
			}return checkData(0, h-t, t-n);
		}
		
		return true;
	}
	
	public static boolean checkData(int a, int b, int c){
		
		if(a!=0){
			if(a==b&&b==c) return true;
			else return false;
			
		}else
			if(b==c) return true;
			else return false;
	}
}