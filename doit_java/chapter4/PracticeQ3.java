/*
�������� �ܺ��� ���ϴ� ���� �۰ų� 
���� �������� ����ϴ� ���α׷��� ����� ������
 */
package chapter4;

public class PracticeQ3 {

	public static void main(String[] args) {
		for(int i =1; i <10; i++) {
			for(int j=1; j<10; j++) {
				if(i < j)
					break;
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}

	}

}
