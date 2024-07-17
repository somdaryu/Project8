package polymorphism;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		//회원 리스트 생성
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		//일반회원과 VIP회원 추가
		Customer c1 = new Customer("둘리");
		Customer c2 = new Customer("또치");
		Customer c3 = new Customer("도우너");
		Customer c4 = new VIPCustomer("마이콜");
		Customer c5 = new VIPCustomer("고길동");
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
		}
		
		for(Customer customer : list) {
			customer.showInfo();
		}
		
	}

}
