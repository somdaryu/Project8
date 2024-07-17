package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();
		
		Customer customer2 = new VIPCustomer("또치");
		customer2.calcPrice(10000);
		customer2.showInfo();
	}

}

class Customer {
	String customerName; // 회원이름
	String customerGrade; // 회원등급
	double bonusPoint; // 보너스포인트
	double bonusRatio; // 적립률

	// 고정값은 생성자에서 초기화
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은" + customerGrade + "이며 보너스 포인트는" + bonusPoint + "입니다.");
	}
}

class VIPCustomer extends Customer {
	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

		System.out.println("VIPCustomer() 생성자 호출");
	}

	// 재정의 규칙 : 선언부 그대로, 구현부만 변경(블록안의부분)
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이" + salePrice + "원을 결제했습니다.");
	}
}

class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이" + salePrice + "원을 결제했습니다.");
	}
	
	
}