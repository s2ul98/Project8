package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.customerName = "둘리";
		customer.calcPrice(10000);
		customer.showInfo();
		
		VipCustomer vip = new VipCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
		
		// 5% 적입은 됐지만. 10프로 할인은 못받음
		// 할인은 지금 해결 할 수 없어서 이 문제는 우선 패스

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
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	
	
}