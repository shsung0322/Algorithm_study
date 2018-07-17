package level2;

import java.util.Scanner;

/*
 <문제>
두 자연수 A와 B가 주어진다. (1 <= A, B <= 10,000)
이때, A+B,A-B,A*B,A/B(몫),A%B(나머지)를 출력하는 프로그램을 작성하시오.
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
*/

public class Step5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		if (scan != null)
			scan.close();

	}
}
