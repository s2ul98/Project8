package downcasting;

public class Ex1 {

	public static void main(String[] args) {
		// 형변환
		Animal animal = new Human();
		// 형변환된 변수로는 readBook()을 사용할 수 없다
		// 다시 readBook을 사용하려면 원래 타입으로 다운캐스팅
		
		System.out.println(animal instanceof Human);
		System.out.println(animal instanceof Tiger);
		System.out.println(animal instanceof Eagle);
		
		// instanceof : 변수가 가르키는 인스턴스의 타입을 확인하는 연산자
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		

	}

}
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//사람 클래스
class Human extends Animal { // 동물클래스 상속받기
	@Override
	public void move() { // 메소드 재정의
		System.out.println("사람이 두 발로 걷습니다. ");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

//호랑이 클래스
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

//독수리 클래스
class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}

	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}