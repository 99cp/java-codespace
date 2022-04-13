//2개의 정수를 입력받아 몫과 나머지를 구하는 프로그램을 작성하시오.
package chap2;

import java.util.Scanner;

public class level3_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 2개 입력하시오.");
		int i = input.nextInt();
		int j = input.nextInt();
		System.out.println("i/j의 몫은 "+i/j);
		System.out.println("i/j의 나머지는 "+i%j);	
	}
}
