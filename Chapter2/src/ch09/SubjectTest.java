package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentBak = new Student(100, "BakSeoyun");
		studentBak.setKoreanSubject("국어", 98);
		studentBak.setMathSubject("수학", 97);
		
		Student studentLee = new Student(200, "LeeJonghan");
		studentLee.setKoreanSubject("국어", 85);
		studentLee.setMathSubject("수학", 92);
		
		studentBak.showScoreInfo();
		studentLee.showScoreInfo();
	}

}
