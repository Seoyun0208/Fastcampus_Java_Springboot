package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person personKim = new Person();
		
		personKim.height = 183;
		personKim.weight = 72;
		personKim.name = "Kim baeseong";
		personKim.age = 34;
		personKim.sex = "남성";
		
		System.out.println(personKim.showPersonInfo());
	}

}
