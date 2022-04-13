//2개의 정수를 입력받아 몫과 나머지를 구하는 프로그램을 작성하시오
package chap3;

import java.util.Scanner;

public class level3_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i = input.nextInt();
		System.out.print("정수를 입력하세요: ");
		int j = input.nextInt();
		
		System.out.println("i/j의 몫은 "+ i/j);
		System.out.println("i/j의 나머지는 "+ i%j);

	}

}
