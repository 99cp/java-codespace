/*
삼항 연산자를 이용하여 정수를 입력받았을 때 입력받은 숫자가 짝수면 "작수입니다.", 
홀수면 "홀수입니다."가 출력되는 프로그램을 작성하시오.
 */
package chap2;

import java.util.Scanner;

public class level3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		String st;
		
		if(i == 0)
			System.out.println("0입니다.");
		else {
			st = (i % 2 == 0) ? "짝수입니다." : "홀수입니다.";
			System.out.println(st);
		}

	}

}
