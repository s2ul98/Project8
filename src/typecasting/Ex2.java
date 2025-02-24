package typecasting;

public class Ex2 {

	public static void main(String[] args) {
		VipCustomer2 vip = new VipCustomer2("듈라");
		vip.showInfo();

	}

}
class Customer2 {
	
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	// 생성자의 목적:
	// 1. 인스턴스 생성
	// 2. 멤버 변수 초기화
	public Customer2(String name) {
		this.customerName = name;
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
class VipCustomer2 extends Customer2 {
	double saleRatio;
	
	// 회원의 이름을 초기화하는 생성자
	public VipCustomer2(String name) {	
		super(name);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");
	


	}
	
	
	
}