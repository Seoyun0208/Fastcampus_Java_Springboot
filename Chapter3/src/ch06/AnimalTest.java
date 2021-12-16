package ch06;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 걷고 있습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽고 있습니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 어슬렁거립니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 하고 있습니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 날고 있습니다.");
	}
	
	public void fly() {
		System.out.println("독수리가 양 날개를 활짝 펼치고서 날고 있습니다.");
	}
	
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}