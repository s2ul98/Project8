package polymorphism;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 자료형을 Customer로 지정
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer("둘리"));
		customerList.add(new GoldCustomer("또치"));
		customerList.add(new VipCustomer("도우너"));

		System.out.println("==== 회원등급에따라 할인율과 보너스 포인트 계산 =====");

		for (Customer customer : customerList) {
			customer.calcPrice(10000);
			customer.showInfo();
		}


	}

}
class GoldCustomer extends Customer {
	
	double saleRatio;

	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02; // 2퍼센트 적립
		saleRatio = 0.1; // 10퍼센트 할인
	}
	
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
		
	}
}