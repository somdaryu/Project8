package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
		Bolpen bolpen = new Bolpen();
		
		bolpen.thickness = 2;
		bolpen.remaining = "100%";
		bolpen.color = "파랑색";
		
		Fountainpen fountain = new Fountainpen();
		fountain.thickness = 3;
		fountain.remaining = "80%";
		fountain.brand = "몽블랑";
		
	}

}

class Pen {
	int thickness;
	String remaining;
}

class Bolpen extends Pen {
	String color;
}

class Fountainpen extends Pen {
	String brand;
}
