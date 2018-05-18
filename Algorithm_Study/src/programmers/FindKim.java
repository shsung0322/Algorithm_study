package programmers;

import java.util.Arrays;

public class FindKim {
	
	public String findKim(String[] seoul){
		
		return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
	
	// 실행을 위한 테스트코드입니다.
	public static void main(String[] args) {
		
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
		
	}
}
