package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeBak = new Employee();
		employeeBak.setEmployeeName("BakSeoyun");
		System.out.println(employeeBak.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("KimBaeseong");
		employeeKim.serialNum++;
		
		System.out.println(employeeBak.serialNum);
		System.out.println(employeeKim.serialNum);
		
	}
}

