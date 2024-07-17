package downcasting;

public class Ex1 {

	public static void main(String[] args) {
		//형변환
		Animal animal = new Human();
		animal.move();
		
		//1.실제 인스턴트 타입이 Human인지 확인 앞에는 변수 뒤에는 클래스
		if(animal instanceof Human) {
			//2.원래타입으로 변경
			Human human = (Human)animal;
			human.readBook();
		}
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}


class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}