package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student seoyun = new Student(20100859, "Seoyun");
		Student huigyeong = new Student(20100859, "Huigyeong");
		Student jihyeon = seoyun;
		
		System.out.println(seoyun == huigyeong);
		System.out.println(seoyun == jihyeon);
		System.out.println("================");
		
		System.out.println(seoyun.equals(huigyeong));
		System.out.println(seoyun.equals(jihyeon));
		System.out.println("================");
		
		System.out.println(seoyun.hashCode());
		System.out.println(huigyeong.hashCode());
		System.out.println(jihyeon.hashCode());
		System.out.println("================");
		
		System.out.println(System.identityHashCode(seoyun));
		System.out.println(System.identityHashCode(huigyeong));
		System.out.println(System.identityHashCode(jihyeon));
		System.out.println("================");		
		
		Student copySeoyun = (Student)seoyun.clone();
		System.out.println(copySeoyun);
		System.out.println("================");	
		
		seoyun.setStudentName("Jihyeon");
		Student copySeoyun2 = (Student)seoyun.clone();
		System.out.println(copySeoyun2);
		
	}
}
