package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2);
		int imsub = minus(num1, num2);
		int product = multiply(num1, num2);
		int quotient = divide(num1, num2);
		
		System.out.println(num1 + " + "+num2+" = "+sum+"입니다");
		System.out.println(num1 + " - "+num2+" = "+imsub+"입니다");
		System.out.println(num1 + " x "+num2+" = "+product+"입니다");
		System.out.println(num1 + " / "+num2+" = "+quotient+"입니다");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int  minus(int i, int j) {
		int result = i-j;
		return result;
	}
		
	public static int multiply (int i, int j) {
		int result = i*j;
		return result;
	}
	
	public static int divide(int i,int j) {
		int result = i/j;
		return result;
	}
}
