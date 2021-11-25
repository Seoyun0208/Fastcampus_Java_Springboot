package ch09;

public class LocalVariableType {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		// str = 3; 한번 선언하여 타입이 추론된 변수는 다른 타입의 값 대입 불가 
	}
}
