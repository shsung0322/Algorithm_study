package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 자연수이다.

출력
시험 성적을 출력한다.
*/

public class Step1 {
	
	public static void main(String[] args){
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			int score = Integer.valueOf(br.readLine());
			System.out.println(level(score));
			
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String level(int score){
		
		if(score>=90) return "A";
		if(score>=80) return "B";
		if(score>=70) return "C";
		if(score>=60) return "D";
		return "F";
	}
}
