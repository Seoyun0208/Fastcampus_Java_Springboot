package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer seoyun = new Customer(10010, "Seoyun");
		seoyun.bonusPoint = 1000;
		int priceSeoyun = seoyun.calcPrice(1000);
		
		System.out.println(seoyun.showCustomerInfo() + " 지불금액은 " + priceSeoyun + "입니다.");
		
		VIPCustomer yuyeong = new VIPCustomer(10020, "Yuyeong");
		yuyeong.bonusPoint = 1000;
		int priceYuyeong = yuyeong.calcPrice(1000);
		
		System.out.println(yuyeong.showCustomerInfo() + " 지불금액은 " + priceYuyeong + "입니다.");
		
		Customer jihyeon = new VIPCustomer(12345, "Jihyeon");
		jihyeon.bonusPoint = 1000;
		int priceJihyeon = jihyeon.calcPrice(1000);
		
		System.out.println(jihyeon.showCustomerInfo() + " 지불금액은 " + priceJihyeon + "입니다.");
	}

}
