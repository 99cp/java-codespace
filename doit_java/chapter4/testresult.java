package doit;

import java.util.Scanner;

public class testresult {

	public static void main(String[] args) {
		char grade;
		
		System.out.println("������ �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		while(score <0 || score >100) {
			System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			score = input.nextInt();
		}
		if(score >=90)
			grade ='A';
		else if(score >=80)
			grade = 'B';
		else if(score >=70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	}
}
