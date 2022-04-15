/*
구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요
 */
package chapter4;

public class PracticeQ2 {

	public static void main(String[] args) {
		for(int i =1; i <=9; i++) {
			if(i %2 != 0)
				continue;
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}

		}
	}
}
