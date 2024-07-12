package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.eat();
		stu.sound();
		stu.study();
		
		Professor pro = new Professor();
		pro.eat();
		pro.sound();
		pro.study();
		pro.work();

	}

}
class Person {
	public void sound() {
		System.out.println("대화를 한다.");
	}

	public void eat() {
		System.out.println("밥을 먹는다.");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("공부를 한다.");
	}
}

class Professor extends Student {
	public void work() {
		System.out.println("일을 한다.");
	}
}