/*
�ܶ� ȸ�� ��
�� �� ����� �� �� ������ �� �� 
�� ���� ��� �������� �ʴ��� ������� �� �� �ִ� ��쿡,
������ ���� ������� �ʴ� ��
 */
package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2)< 10);
		/*�� ���� ������� �����̹Ƿ� �� ���� ���캼 �ʿ䰡 ����
		����(i = i + 2)< 10 ������ ������� ����*/
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10 || ((i = i + 2) < 10));
		/*�� ���� ������� ���̹Ƿ� �� ���� ���캼 �ʿ䰡 ����
		����(i = i + 2)< 10 ������ ������� ����*/
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
/*
a && b ������ a�� b�� ���� ���϶��� true�� ��� �̿ܿ��� false  
a || b ������ a�Ǵ� b�� �ϳ��� ���̸� true�� ��� �̿ܿ��� false
*/
