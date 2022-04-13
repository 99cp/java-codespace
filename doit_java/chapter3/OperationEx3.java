/*
단락 회로 평가
논리 곱 연산과 논리 합 연산을 할 때 
두 항을 모두 실행하지 않더라도 결과값을 알 수 있는 경우에,
나머지 항은 실행되지 않는 것
 */
package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2)< 10);
		/*앞 항의 결과값이 거짓이므로 뒷 항을 살펴볼 필요가 없음
		따라서(i = i + 2)< 10 문장이 실행되지 않음*/
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10 || ((i = i + 2) < 10));
		/*앞 항의 결과값이 참이므로 뒷 항을 살펴볼 필요가 없음
		따라서(i = i + 2)< 10 문장이 실행되지 않음*/
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
/*
a && b 연산은 a와 b가 전부 참일때만 true를 출력 이외에는 false  
a || b 연산은 a또는 b중 하나라도 참이면 true를 출력 이외에는 false
*/
