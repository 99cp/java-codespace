/*
opertor 값이 +,-,*,/인 경우에 사칙 연산을 수행하는 프로그램을
if-else if문과 switch-case문을 사용해 작성해 보세요.
 */
package chapter4;

import java.util.Scanner;

public class PracticeQ1 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("+, -, &, / 중 하나를 입력하세요");
		char operator = input.next().charAt(0); 
		
		while(count == 0){
			if(operator == '+' || count =='-' || count =='*'|| count == '/') {
				count++;
				continue;
			}
			System.out.println("잘못 입력했습니다.");
			System.out.println("+, -, &, / 중 하나를 입력하세요");
			operator = input.next().charAt(0);
		}
		
		switch(operator) {
		case '+' : case '-' :case '*': case '/':
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
		}		
	}

}
