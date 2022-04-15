/*
반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
 */
package chapter4;

public class PracticeQ4 {

	public static void main(String[] args) {
		int blank =3;
		int star =1;
		for(int i=0; i<4; i++) {
			for(int k = 0; k<blank; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<star;j++) {
				System.out.print("*");
			}
			star+=2;
			blank--;
			System.out.println();
		}
	}
}
