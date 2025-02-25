package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Animal> anList = new ArrayList<Animal>();
		anList.add(new Human());
		anList.add(new Tiger());
		anList.add(new Eagle());
		
		ArrayList<Animal> aniList;
		for (int i = 0; i < anList.size(); i++) {

			Animal ani = anList.get(i); //요소를 꺼내서 Animal형 변수에 저장

			if (ani instanceof Human) { // 인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) { // 인스턴스의 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger형으로 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) { // 인스턴스의 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Eagle형으로 다운캐스팅
				e.flying();
			}
		}
	}

}
