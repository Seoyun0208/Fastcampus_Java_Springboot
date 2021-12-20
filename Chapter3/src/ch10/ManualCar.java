package ch10;

public class ManualCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("사람이 자동차를 운전합니다.");
		System.out.println("사람이 자동차 핸들을 조작합니다.");
	};
	
	@Override
	public void stop() {
		
		System.out.println("사람이 장애물 앞에서 브레이크를 밟아서 자동차를 멈추게 합니다.");
		
	};

}
