package ch08;

public class DeliveryOrder {

	long orderNumber;
	int phoneNumber;
	String address;
	int date;
	int time;
	int menuNumber;
	
	public String showDeliveryInfo() {
		
		return 
			"주문 접수 번호 : " + orderNumber + "\n" +
			"주문 핸드폰 번호 : " + String.format("%011d", phoneNumber) + "\n" +
			"주문 집 주소: " + address  + "\n" +
			"주문 날짜 : " + date  + "\n" +
			"주문 가격 : " + time  + "\n" +
			"메뉴 번호 : " + String.format("%04d", menuNumber)  + "\n";
	}
}
