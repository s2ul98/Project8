package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		// 함수 호출
		// 함수 이름(인자)
		
		// 오버로딩된 함수를 선택하는 방법
		// 함수이름(인자를 선택하여 입력)
		
		// 1. 인스턴스 생성 후 참조변수를 대입
		// 2. 바로 인스턴스 생성
		Human human = new Human();
		moveAnimal(human);
		
		moveAnimal(new Tiger());
		
		moveAnimal(new Eagle());

	}
	
	// 함수 이름은 같고 매개변수만 다른 것 : 오버로딩
	
	// 사람을 매개변수로 입력받는 매소드
	public static void moveAnimal(Human human) {
		human.move();
	}
	
	// 호랑이를 매개변수로 입력받는 매소드
	public static void moveAnimal(Tiger tiger) {
		tiger.move();
	}
	
	// 독수리를 매개변수로 입력받는 매소드
	public static void moveAnimal(Eagle eagle) {
		eagle.move();
	}
	
	public static void movwAnimal(Animal animal) {
		animal.move();
	}
	
	
}
