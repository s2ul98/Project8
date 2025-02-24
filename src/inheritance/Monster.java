package inheritance;

public class Monster {
	int power;
	int stamina;
	
	public void doAttack() {
		System.out.println("몬스터가 " + power + "만큼 공격했다!");
	}

	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + power + "이고 체력은 " + stamina + "이다.");
	}
	
}