package programmers;

import java.util.Arrays;

/*	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환해주는 gcdlcm 함수를 완성해 보세요. 
	배열의 맨 앞에 최대공약수(공약수 중에서 가장 큰 수), 그 다음 최소공배수(공배수 중에서 가장 작은 수)를 넣어 반환하면 됩니다. 
	예를 들어 gcdlcm(3,12) 가 입력되면, [3, 12]를 반환해주면 됩니다.
*/

public class TryHelloWorld {
	
    public int[] gcdlcm(int a, int b) {
    	
        int[] answer = new int[2];
        int divisor = a>b?b:a;	// 두 값 중 작은 값
        int multiple = a>b?a:b;	// 두 값 중 큰 값
        
        int[]temp = new int[divisor];
        
        for(int i = 1; i <= multiple; i++){	
        	
        	if(multiple%i==0) temp[i] = multiple/i;
        	if(i == multiple){
        		for(int j = 1; j <= divisor; j++){
        			if(divisor%j==0 && temp[j] == divisor/j){
        				if(answer[0] != 0){
        					
        					answer[0] = answer[0] > (divisor/j) ? answer[0] : (divisor/j);
        				}else
        					answer[0] = divisor/j;
        			}		
        		}
        	}
        	
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }


}
