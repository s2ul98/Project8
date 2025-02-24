package inheritance;

public class Quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.leg= 4;
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.leg = 2;
		eagle.wings = 2;

	}

}
class Animal { 
	int leg;
}

// 호랑이와 독수리는 동물의 자식이다

class Tiger extends Animal {
	int tail;
}

class Eagle extends Animal {
	int wings;
}

//문제 답이 숫자이기때문에 public가 아닌 int로 해야됨