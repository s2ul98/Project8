package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		// 자식 인스턴스 생성
		Child child = new Child();
		child.nationality = "한국";
		child.lasrName = "고";
		child.firstName = "길동";

	}

}

// 부모 클래스
class Parents {
	String nationality; // 국정
	String lasrName; // 성
}
// 자식 클래스
// 클래스를 상속 받는 방법 : extends 키워드 + 부모 클래스의 이름
class Child extends Parents { 
	String firstName; // 이름
}