package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		Child person1 = new Child("한국", "고", "길동");
		System.out.println(person1.nation+", "+person1.lastName+", "+person1.name);
	}

}

class Parents {
	String nation;
	String lastName;
	
	public Parents(String nation, String lastName) {
		super();
		this.nation = nation;
		this.lastName = lastName;
	}
}

class Child extends Parents{
	String name;

	public Child(String nation, String lastName, String name) {
		super(nation, lastName);
		this.name = name;
	}
}