/*
opertor ���� +,-,*,/�� ��쿡 ��Ģ ������ �����ϴ� ���α׷���
if-else if���� switch-case���� ����� �ۼ��� ������.
 */
package chapter4;

import java.util.Scanner;

public class PraacticeQ1 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("+, -, &, / �� �ϳ��� �Է��ϼ���");
		char operator = input.next().charAt(0); 
		
		while(count == 0){
			if(operator == '+' || count =='-' || count =='*'|| count == '/') {
				count++;
				continue;
			}
			System.out.println("�߸� �Է��߽��ϴ�.");
			System.out.println("+, -, &, / �� �ϳ��� �Է��ϼ���");
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
