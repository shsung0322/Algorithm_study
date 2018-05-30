package programmers;

/*
 * 앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
 * 문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 완성해 주세요.
 * 예를들면, 문자열 s가 abcdcba이면 7을 return하고 abacde이면 3을 return합니다.
 * 문자열 s의 길이 : 2500 이하의 자연수
 * 문자열 s는 알파벳 소문자로만 구성
 * 
 */

public class Palindrome {
	
	public int solution(String s)
    {
                
		int answer = 0;
		String reverseString = new StringBuffer(s).reverse().toString();
		
		if(s.contentEquals(reverseString)) return answer = s.length();
		
		else{
			
			
			return answer = checkString(s, reverseString);
		}
    }
	
	public int checkString(String s, String reverseString){
		
		int startIdx = 0;
		int endIdx = 0;
		int result = 0;
		
		while(s.length() >= endIdx){
			
			boolean flag = reverseString.contains(s.substring(startIdx, endIdx));
			
			if(flag){
				
				result = result >= s.substring(startIdx, endIdx).length() ? result : s.substring(startIdx, endIdx).length();
				endIdx++;
				
			}else{
				
				startIdx++;
				endIdx = startIdx;
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args){
		
		Palindrome palindrome = new Palindrome();
		int result = palindrome.solution("abaaadaa"); //abcdabcdcba
		
		System.out.println(result);
	}
}
