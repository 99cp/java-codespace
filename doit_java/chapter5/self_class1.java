//주문 내용에 대한 클래스를 만들고 주문 내용을 인스턴스로 생성한 후 출력하시오
package classpart;

public class self_class1 {
	String num = "201803120001";
	String id = "abc123";
	String date = "2018년 3월 12일";
	String name = "홍길순";
	String product = "PD0345-12";
	String address = "서울시 영등포구 여의도동 20번지";
	
	public static void main(String[] args) {
		self_class1 self = new self_class1();
		System.out.println("주문 번호: "+ self.num);
		System.out.println("주문자 아이디: "+self.id);
		System.out.println("주문 날짜: "+self.date);
		System.out.println("주문자 이름: "+self.name);
		System.out.println("주문 상품 번호: "+self.product);
		System.out.println("배송 주소: "+self.address);

	}

}
