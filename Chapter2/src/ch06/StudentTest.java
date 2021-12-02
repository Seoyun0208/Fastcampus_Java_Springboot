package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentBak = new Student();
		studentBak.grade = 1;
		studentBak.studentName = "Bak Seoyun";
		studentBak.studentNumber = 20100859;
		
		System.out.println(studentBak.showStudentInfo());
		
		Student studentLee = new Student(123456, "Lee Jonghan", 3);
		
		System.out.println(studentLee.showStudentInfo());
	}

}
