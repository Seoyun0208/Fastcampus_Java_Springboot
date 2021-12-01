package ch03;

public class FunctionTest {

	public static int addNum(int num1, int num2) { // 반환 값이 있는 경우 
		
		int result;
		result = num1 + num2;
		return result;
		
	}
	
	public static void sayHello(String greeting) { // 반환 값이 없는 경우 
	
		System.out.println(greeting);
		
	}
	
	public static int calcSum() { // 매개변수가 없고 반환 값이 있는 경우 
		
		int sum = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			
			sum += i;
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요!");
		
		total = calcSum();
		System.out.println(total);
		
	}

}
