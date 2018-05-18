package programmers;

public class SumMatrix {
	
	int[][] sumMatrix(int[][] A, int[][] B) {
		
		int[][] answer = A;
		
		
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[i].length; j++){
				answer[i][j] = A[i][j] + B[i][j];
				
			}
		}
		
		
		/*int row = Math.max(A.length, B.length);
	    int col = Math.max(A[0].length, B[0].length);
	       
	    int[][] answer = new int[row][col];
	    
	    for(int i=0; i<row ; i++){
	      for(int j=0; j<col; j++){
	        answer[i][j] = A[i][j] + B[i][j];
	      }
	    }*/
		

		return answer;
	}
		
	public static void main(String[] args){
		
		SumMatrix c = new SumMatrix();
		int[][] A = { { 10, 4 }, { 2, 1 },{6,1} };
		int[][] B = { { 1, 4 }, { 5, 6 },{1,9} };
		int[][] answer = c.sumMatrix(A, B);
		
		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < answer[i].length; j++){
				System.out.println(answer[i][j]);
			}
		}
		
	}
	
}
