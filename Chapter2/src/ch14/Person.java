package ch14;

public class Person {

	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1300);
		this.money -= 1300;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1400);
		this.money -= 1400;
	}
	
	public void showInfo() {
		
		System.out.println(personName + "님의 남은 돈은 " + money + "원입니다.");
		
	}
}
