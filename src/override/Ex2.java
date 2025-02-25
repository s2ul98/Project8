package override;

public class Ex2 {

	public static void main(String[] args) {
		
		// 형변환
		 Customer vc = new VipCustomer("둘리");
		 // 형변환된 변수는 부모가 물려준 속성과 메소드만 사용할 수 있다
		 vc.calcPrice(10000);
		 
		 // 프로그램이 종작할때 (런타임시)
		 // 어떤 calcPrice 함수를 사용할지 결정한다

		 // 형변환된 변수는 자식의 오버라이드된 메소드를 호출함
		 // 형변환된 변수는 부모의 것만 사용할 수 있다고 했지만 오버라이드 메소드는 예외
	}

}
