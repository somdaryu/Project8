package polymorphism;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리"));
		list.add(new GoldCustomer("또치"));
		list.add(new VIPCustomer("도우너"));
		
		System.out.println("======== 회원등급에 따라 할인율과 보너스포인트 계산 ========");
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
	}
}
