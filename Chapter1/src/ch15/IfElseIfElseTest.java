package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		
		System.out.println("직원: 나이가 어떻게 되세요?");
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int charge;
		
		if (x < 8) {
			charge = 1000;
			System.out.println("직원: " + x + "살이시면 미취학 아동이시군요.");
		}
		else if (x < 14) {
			charge = 2000;
			System.out.println("직원: " + x + "살이시면 초등학생이시군요.");
		}
		else if (x < 20) {
			charge = 2500;
			System.out.println("직원: " + x + "살이시면 중, 고등학생이시군요.");
		}
		else {
			charge = 3000;
			System.out.println("직원: " + x + "살이시면 일반인이시군요.");
		}
		System.out.println("입장료 " + charge + "원입니다.");
	}
}
