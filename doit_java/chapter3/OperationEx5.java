/*
비트 이동 연산자
비트 연산자 중 비트단위로 이동시키는 연산자
*/

package chapter3;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		//>>>연산자는 >>연산자와 다르게 왼쪽에 채워지는 비트 값이 부호 비트와 상관없이
		//무조건 0이 된다.
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}
}
