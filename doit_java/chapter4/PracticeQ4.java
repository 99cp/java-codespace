/*
�ݺ����� ����Ͽ� ���� ����� ����ϴ� ���α׷��� ����� ������
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
