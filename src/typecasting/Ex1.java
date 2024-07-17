package typecasting;


public class Ex1 {

	public static void main(String[] args) {
		VIPCustomer vip = new VIPCustomer();
	}

}


class Customer {
	String customerName; //회원이름
	String customerGrade; //회원등급
	double bonusPoint; //보너스포인트
	double bonusRatio; //적립률
	
	//고정값은 생성자에서 초기화
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 "+price+"원을 결제했습니다.");
	}
	
	public void showInfo() {
		System.out.println(customerName+"님의 등급은"+customerGrade+"이며 보너스 포인트는"+bonusPoint+"입니다.");
	}
}

class VIPCustomer extends Customer{
	double saleRatio;
	
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}

