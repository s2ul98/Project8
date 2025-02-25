package polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 더형성을 활용하여 쇼핑몰 관리 프로그램 구현하기
		// 회원 리스트 생성
		// <E> : 리스트 안에 담을 데이터 타입
		// 회원의 종류? Customer or VIP
		// 부모인 Customer로 선언하면 둘다 담을 수 있음
		ArrayList<Customer> list = new ArrayList<Customer>();

		list.add(new Customer("둘리"));
		list.add(new Customer("또치"));
		list.add(new Customer("도우너"));
		list.add(new VipCustomer("마이콜"));
		list.add(new VipCustomer("고길동"));
		
		// 모든 회원이 물건을 구매
		for(Customer customer:list) {
			customer.calcPrice(10000);
		}
		for(Customer customer:list) {
			customer.showInfo();
	}
	}
}
