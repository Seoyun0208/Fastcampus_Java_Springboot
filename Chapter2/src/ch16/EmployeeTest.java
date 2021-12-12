package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeBak = new Employee();
		employeeBak.setEmployeeName("BakSeoyun");
		
		System.out.println(employeeBak.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("KimBaeseong");
		
		System.out.println(employeeBak.getEmployeeName() + " 님의 사번은 " + employeeBak.getEmployeeId() + "입니다.");
		System.out.println(employeeKim.getEmployeeName() + " 님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
		
	}
}

