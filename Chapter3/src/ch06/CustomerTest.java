package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer seoyun = new Customer(1001, "Seoyun");
		Customer yuyeong = new GoldCustomer(1002, "Yuyeong");
		Customer suin = new Customer(1003, "Suin");
		Customer yaeeun = new GoldCustomer(1004, "Yaeeun");
		Customer sunhui = new VIPCustomer(1005, "Sunhui");
		
		customerList.add(seoyun);
		customerList.add(yuyeong);
		customerList.add(suin);
		customerList.add(yaeeun);
		customerList.add(sunhui);
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.showCustomerInfo());
			System.out.println(customer.getCustomerName() + "님은 " + cost + "원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
			System.out.println("==============================");
		}
	}

}
