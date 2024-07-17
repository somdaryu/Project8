package polymorphism;

public class Quiz1 {

	public static void main(String[] args) {
		runCar(new Bus());
		runCar(new SportsCar());

	}
	public static void runCar(Car car) {
		car.move();
	}
}

class Car{
	public void move() {
		
	}
}

class Bus extends Car{

	@Override
	public void move() {
		System.out.println("버스가 달린다.");
	}
	
}

class SportsCar extends Car{

	@Override
	public void move() {
		System.out.println("스포츠카가 달린다.");
	}
	
}