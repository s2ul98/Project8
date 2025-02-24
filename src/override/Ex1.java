package override;



public class Ex1 {

	public static void main(String[] args) {
		
		// 일반 회원 생성
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000); // 만원짜리 물건 구매
		customer.showInfo();
		
		// VIP 회원 생성
		VipCustomer vipCustomer = new VipCustomer("또치");
		// ccalcPrice
		vipCustomer.calcPrice(10000); // 만원짜리 물건 구매
		vipCustomer.showInfo();
		
//		vipCustomer.
		
		// VIP는 10퍼센트를 할인받아서 9000원 지불

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
	public Customer(String name) {
		this.customerName = name;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01; // 1%
//		System.out.println("Customer 생성자 호출");
	}
	// 쇼핑몰 제품을 구매하는 메소드
	// 가격을 지불하고, 보너스 포인트 적립
	// 리턴값x 매개변수(구매하려는 물건의 가격)
	public void calcPrice(int price) {
		// 기존 보너스 포인트 + 물건가격 0.01
		bonusPoint = bonusPoint + price*bonusRatio;
		// 일반회원은 물건의 정가를 그대로 지불한다
		System.out.println(customerName + "님이 " +  price + "원을 결제했습니다.");	
	}
	public void showInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 " + bonusPoint+"점 입니다.");
	}
}

// VIP회원
class VipCustomer extends Customer {
	double saleRatio; // 할인률
	
	// 회원의 이름을 초기화하는 생성자
	public VipCustomer(String name) {	
		super(name);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
//		System.out.println("VIPCustomer 생성자 호출");
	}
	// 매소드 재정의
	//vip는 물간가격의 10퍼센트 할인 받는다
	
	//오버라이드란?
	//부모가 물려준 메소드를 재정의 하는 것
	//조건: 부모의 메소드와 선언부가 같고, 블록내부는 달라도 됨
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + price*bonusRatio; //적립
		double salePrice = price - price*saleRatio;
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다."); //할인된 가격을 지불
	}
	
	
}