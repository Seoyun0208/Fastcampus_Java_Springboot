package ch15;

public class Person {
	
	String personName;
	int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(5800);
		this.money -= 5800;
	}
	
	public void showInfo() {
		
		System.out.println(personName + " 님의 남은 돈은 " + money + "원입니다.");
		
	}
	
}
