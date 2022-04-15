package ifexample;

import java.util.Scanner;

public class self_testresult {

	public static void main(String[] args) {
		char grade;
		
		System.out.println("성적을 입력하세요");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		while(score <0 || score >100) {
			System.out.println("잘못 입력했습니다. 다시 입력하세요");
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
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}
}
