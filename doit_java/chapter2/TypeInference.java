package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;			//int 로 컴파일됨
		var j = 10.0;		//double로 컴파일됨
		var str = "hello";	//String으로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str =3; str 변수는 String형으로 선언됐으므로 정수값 불가능
	}

}
