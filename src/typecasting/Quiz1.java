package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		Child child = new Child("한국","고","길동");
		System.out.println(child.nationality);
		System.out.println(child.lastName);
		System.out.println(child.firsName);
		
		//형변환
		// 형변환의 규칙 : 
		Parents pc = new Child("한국", "오","아리");
		System.out.println(pc.nationality);
		System.out.println(pc.lastName);
		//
		

	}

}
class Parents {
	String nationality;
	String lastName;
	
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
}
class Child extends Parents {
	String firsName;

	public Child(String nationality, String lastName, String firsName) {
		super(nationality, lastName);
		this.firsName = firsName;
			
		}
}