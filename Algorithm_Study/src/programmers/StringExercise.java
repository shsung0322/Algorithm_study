package programmers;

// 문자열의 가운데 글자 가져오기 문자열이 짝수면 2개, 홀수면 1개

public class StringExercise {
    String getMiddle(String word){
    	
    	int length = word.length()%2;
    	String result = "";
    	
    	if(length == 0){
    		length = word.length()/2;
    		result = word.substring(length-1, length+1); //문자열의 인덱스는 0부터 시작
    	}else{
    		length = word.length()/2;
    		result = word.substring(length,length+1);
    	}
    		

    	return result; //word.substring((word.length()-1)/2, word.length()/2 + 1);    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("tree"));
    }
}
