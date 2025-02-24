package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		
		Monster monster = new Monster();
		monster.power = 10;
		monster.stamina = 100;
		monster.showInfo();
		monster.doAttack();

		
		Slime slime = new Slime();
		slime.power = 30;
		slime.stamina = 200;
		slime.skill = "마비";
		slime.showInfo();
		slime.doAttack();
		slime.doSkill();

	}

}
