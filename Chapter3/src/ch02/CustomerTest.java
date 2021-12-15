package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer seoyun = new Customer();
		seoyun.setCustomerName("Seoyun");
		seoyun.setCustomerID(10010);
		seoyun.bonusPoint = 1000;
		
		System.out.println(seoyun.showCustomerInfo());
		
		VIPCustomer yuyeong = new VIPCustomer();
		yuyeong.setCustomerName("Yuyeong");
		yuyeong.setCustomerID(10020);
		yuyeong.bonusPoint = 5000;
		
		System.out.println(yuyeong.showCustomerInfo());
		
	}

}
