package inheritance;

public class Quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.leg = "다리4개";
		tiger.tail = "꼬리1개";
		System.out.println(tiger.leg +", "+ tiger.tail);
		
		Eagle eagle = new Eagle();
		eagle.leg = "다리2개";
		eagle.wings = "날개2개";
		System.out.println(eagle.leg +", "+ eagle.wings);
	}

}

class Animal {
	String leg;
}

class Tiger extends Animal {
	String tail;
}
class Eagle extends Animal {
	String wings;
}
