package polymorphism;



public class Quiz1 {

	public static void main(String[] args) {
		
		runCar(new Bus()); // Car car = new Bus()
		runCar(new SportsCar()); // Car car = new SportsCar()
	}

	// 1. 부모 타입의 매개변수를 사용해서 자식클래스인 버스와 스포츠카를 받기
	public static void runCar(Car car) {
		car.drive(); // 재정의된 메소드가 호출됨
	}

	// 2. 또는 각 클래스 타입의 매개변수로 메소드를 만들기
	public static void runCar(Bus bus) {
		bus.drive();
	}

	public static void runCar(SportsCar sportsCar) {
		sportsCar.drive();
	}

	}
	
	
	
class Car {
	public void drive() {
		System.out.println("자동차가 주행한다");
	}
}
class Bus extends Car {
	@Override
	public void drive() {
		System.out.println("버스가 주행한다");
	}
}
class SportsCar extends Car {
	@Override
	public void drive() {
		System.out.println("스포츠카가 주행한다");
	}
}