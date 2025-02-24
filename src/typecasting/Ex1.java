package typecasting;

public class Ex1 {

	public static void main(String[] args) {
		
		//vip 회원 생성
		VipCustomer vipCustomer = new VipCustomer();
		// 부모 클래스의 생성자가 호출될때, 이름/등급/포인트/적립률 속상이 생성됨
		// 자식 클래스의 생성자가 호출될때, 할인률 속성이 생성됨
		// 따라서 VIP는 총 5개의 속성을 가지게됨
		
	}

}

class Customer {
	
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	// 생성자의 목적:
	// 1. 인스턴스 생성
	// 2. 멤버 변수 초기화
	public Customer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01; // 1%
		System.out.println("Customer 생성자 호출");
	}
	// 쇼핑몰 제품을 구매하는 메소드
	// 가격을 지불하고, 보너스 포인트 적립
	// 리턴값x 매개변수(구매하려는 물건의 가격)
	public void calcPrice(int price) {
		// 기존 보너스 포인트 + 물건가격 0.01
		bonusPoint = bonusPoint + price*bonusRatio;
		System.out.println(customerName + "님이 " +  price + "원을 결제했습니다.");	
	}
	public void showInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 " + bonusPoint+"점 입니다.");
	}
}

// VIP회원
class VipCustomer extends Customer {
	double saleRatio;
	
	public VipCustomer() {
		// super는 부모를 가리키는 키워드이다
		// super()는 생략할 수 있다(없으면 컴파일러가 자동으로 생성함)
//		super(); // 부모의 생성자를 호출
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");
	

//		super() 코드는 생성자의 첫번째 줄에만 작성 가능 	
	}
	
	
	
}