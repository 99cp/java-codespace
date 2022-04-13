//원의 반지름을 입력 받아 원의 둘레와 넓이를 구하는 프로그램을 작성하시오
package chap3;

import java.util.Scanner;

public class level3_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요: ");
		double i = input.nextDouble();
		
		System.out.println("원의 둘레는: "+2*i*3.14);
		System.out.println("원의 넓이는: "+3.14*i*i);
		
	}

}
