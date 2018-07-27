package level4;

import java.util.ArrayList;
import java.util.Scanner;

/*
문제
세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.
*/

public class Step2 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split(" ");
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numList.add(Integer.valueOf(data[0]));
		numList.add(Integer.valueOf(data[1]));
		numList.add(Integer.valueOf(data[2]));
		
		System.out.println(bigNum(numList));
	
	}
	
	public static int bigNum(ArrayList<Integer> numList){
		
		
		if(numList.get(0) > numList.get(1)){
			
			if(numList.get(0) > numList.get(2)){
				
				if(numList.get(1) > numList.get(2)) return numList.get(1);
				else return numList.get(2);
			
			}else return numList.get(0);
		
		}else{
			
			if(numList.get(1) > numList.get(2)){
				
				if(numList.get(0) > numList.get(2)) return numList.get(0);
				else return numList.get(2);
			
			}else return numList.get(1);
		
		}
	}
}