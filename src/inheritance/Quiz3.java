package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
		BallPen ballPen = new BallPen();
		ballPen.thickness = 2;
		ballPen.amount = 100;
		ballPen.color = "파랑";
		ballPen.showInfo();
		
		FountainPen fountainPen = new FountainPen();
		fountainPen.thickness = 3;
		fountainPen.amount = 80;
		fountainPen.brand = "몽블랑";
		fountainPen.showInfo();
	}

}
 class Pen {
	 int thickness;
	 int amount;
 }
 
 class BallPen extends Pen {
	 String color;
	 
	 public void showInfo() {
		 System.out.println("펜의 굵기: " + thickness + " 남은 양: " + amount + " 볼펜의 색: " + color);
	 }
 }
 class FountainPen extends Pen {
	 String brand;
	 
	 public void showInfo() {
		 System.out.println("펜의 굵기 : " + thickness + " 남은 양: " + amount + " 브랜드: " + brand);
	 }
 }
 
 