package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Person seoyun = new Person("Seoyun", 5000);
		Person huigyeong = new Person("Huigyeong", 10000);
		
		Bus bus301 = new Bus(301);
		Bus bus104 = new Bus(104);
		
		huigyeong.takeBus(bus301);
		
		Subway busanSubway = new Subway(2);
		
		seoyun.takeSubway(busanSubway);
		
		huigyeong.showInfo();
		seoyun.showInfo();
		
		bus301.showBusInfo();
		bus104.showBusInfo();
		
		busanSubway.showSubwayInfo();
	}
}
