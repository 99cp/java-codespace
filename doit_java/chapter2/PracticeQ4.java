/*
Q4. 변수 두 개를 선언해서 10과 2.0을 대입하고 
두 변수의 사칙 연산 결과를 정수로 출력
*/
package chapter2;

public class PracticeQ4 {

	public static void main(String[] args) {
		int iNum = 10;
		double dNum = 2.0;
		
		int sum = (int)(iNum + dNum);
		int imsub = (int)(iNum - dNum);
		int product = (int)(iNum * dNum);
		int quotient = (int)(iNum / dNum);
		
		System.out.println(sum);
		System.out.println(imsub);
		System.out.println(product);
		System.out.println(quotient);

	}

}
