package ch08;

public class DeliveryOrderTest {

	public static void main(String[] args) {
		
		DeliveryOrder seoyun = new DeliveryOrder();
		
		seoyun.orderNumber = 202112041533L;
		seoyun.phoneNumber = 1059530208;
		seoyun.address = "대전광역시 서구 갈마동 349-14";
		seoyun.date = 20211204;
		seoyun.time = 153327;
		seoyun.menuNumber = 2;
		
		System.out.println(seoyun.showDeliveryInfo());
	}

}
