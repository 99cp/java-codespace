package chapter3;

public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; 
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
	}
}
/*
var = ++num은 num값이 1 증가한 후 var 변수에 대입
var = num++ num을 var 변수에 대입한 후 num값 1감소
*/