//반복문을 이용하여 구구단을 출력하는 프로그램을 작성하시오.
package chap3;

public class level3_14 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++){
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}

	}

}
