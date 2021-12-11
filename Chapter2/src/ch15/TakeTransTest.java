package ch15;

public class TakeTransTest {

	public static void main(String[] args) {

		Person huigyeong = new Person("Huigyeong", 10000);
		
		Taxi taxi = new Taxi("달려라 운수");
		
		huigyeong.takeTaxi(taxi);
		
		huigyeong.showInfo();
		
		taxi.showTaxiInfo();
	}

}
