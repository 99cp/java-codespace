/*
반복문과 조건문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
 */
package chapter4;

public class PracticeQ5 {

	public static void main(String[] args) {
		int star = 1;
		int blank = 3;
		for(int i=0; i<7; i++) {
			for(int j=0; j<blank; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=2) {
				blank --;
				star +=2;
			}
			else {
				blank++;
				star-=2;
			}
		}
	}

}
