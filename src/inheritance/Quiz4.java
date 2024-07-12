package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.power = 10;
		monster.hp = 100;
		monster.showInfo();
		monster.attack();

		System.out.println();
		
		Slime slime = new Slime();
		slime.power = 30;
		slime.hp = 200;
		slime.attack();
		slime.showInfo();
		slime.castSkill();
	}

}

class Monster {
	int power;
	int hp;
	
	public void attack() {
		System.out.println("몬스터가 "+power+"만큼 공격했다.");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 "+power+"이고 체력은"+hp+"이다.");
	}
}

class Slime extends Monster{
	String skill;
	
	public Slime() {
		skill = "마비";
	}
	
	public void castSkill() {
		System.out.println("슬라임이 "+skill+"를 시전했다.");
	}
}