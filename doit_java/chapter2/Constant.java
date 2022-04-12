//상수 사용하기
//상수란 항상 변하지 않는 수
//상수를 사용하면 상수부분만 변경하면 되므로 값 변경이 자유롭다
package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100; //상수는 final로 선언
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; 오류: 상수는 값을 변경할 수 없음

	}

}
