package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car herSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(herSonata.getCarNum());
	}

}
