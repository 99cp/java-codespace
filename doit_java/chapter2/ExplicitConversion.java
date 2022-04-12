//명시적 형 변환
//자료형에 괄호를 씌워서 형 변환을 시킴
package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2); //계산 결과값을 형 변환시킴
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
