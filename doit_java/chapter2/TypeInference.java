package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;			//int �� �����ϵ�
		var j = 10.0;		//double�� �����ϵ�
		var str = "hello";	//String���� �����ϵ�
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str =3; str ������ String������ ��������Ƿ� ������ �Ұ���
	}

}
