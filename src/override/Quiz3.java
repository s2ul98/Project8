package override;

public class Quiz3 {

	public static void main(String[] args) {
		// 부모타입의 변수 = 자식 인스턴스 (형변환)
		//형 변환된 변수는 부모가 물려준 기능만 사용할 수 있다
		// 하지만 재정의된 함수는 예외
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		
		// 형변환된 변수로 메소드를 호출하면 실제 객체가 가지고 있는 메소드가 호출됨
		Computer computer2 = new Notebook();
		computer2.on();
		computer2.off();
		
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();	

	}

}
class Computer {
	
	public void on() {
		System.out.println("컴퓨터를 켭니다");
	} 
	
	public void off(){
		System.out.println("컴퓨터를 끕니다");
	}
}

// 노트북 클래스
class Notebook extends Computer {

	// 노트북에 맞게 메소드를 재정의
	@Override
	public void on() {
		System.out.println("노트북을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("노트북을 끕니다");
	}
	
}

// 데스크탑 클래스
class Desktop extends Computer {

	// 데스크탑에 맞게 메소드를 재정의
	@Override
	public void on() {
		System.out.println("데스크탑을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끕니다");
	}
}