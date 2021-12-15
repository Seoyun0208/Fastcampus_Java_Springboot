package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer seoyun = new Customer(10010, "Seoyun");
		seoyun.bonusPoint = 1000;
		
		System.out.println(seoyun.showCustomerInfo());
		
		VIPCustomer yuyeong = new VIPCustomer(10020, "Yuyeong");
		yuyeong.bonusPoint = 5000;
		
		System.out.println(yuyeong.showCustomerInfo());
		
	}

}
