/*
���� �����ڸ� �̿��Ͽ� ������ �Է¹޾��� �� �Է¹��� ���ڰ� ¦���� "�ۼ��Դϴ�.", 
Ȧ���� "Ȧ���Դϴ�."�� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package chap2;

import java.util.Scanner;

public class level3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		String st;
		
		if(i == 0)
			System.out.println("0�Դϴ�.");
		else {
			st = (i % 2 == 0) ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
			System.out.println(st);
		}

	}

}
