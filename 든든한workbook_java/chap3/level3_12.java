//1부터 100까지 숫자 중 소수를 출력하는 프로그램을 작성하시오
package chap3;
//소수란 자기자신과 1을제외한 약수가 없는 수
public class level3_12 {

	public static void main(String[] args) {
		for(int i = 2; i<=100; i++) {
			int count = 0;
			for(int j = 2; j<=i; j++) {
				if(i%j == 0)
					count++;
			}
			if(count == 1)
				System.out.println(i+" ");
		}

	}

}
