//1���� 100���� ���� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
package chap3;
//�Ҽ��� �ڱ��ڽŰ� 1�������� ����� ���� ��
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
