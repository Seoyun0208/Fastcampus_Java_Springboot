package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student seoyun = new Student(1001, "Seoyun");
		seoyun.addSubject("영어", 100);
		seoyun.addSubject("수학", 87);
		
		Student yuyeong = new Student(1002, "Yuyeong");
		yuyeong.addSubject("국어", 90);
		yuyeong.addSubject("수학", 74);
		yuyeong.addSubject("영어", 58);
		
		seoyun.showScoreInfo();
		System.out.println("========================================");
		yuyeong.showScoreInfo();
		
	}

}
