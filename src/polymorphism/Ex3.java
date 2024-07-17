package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		moveAnimal(new Human());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
