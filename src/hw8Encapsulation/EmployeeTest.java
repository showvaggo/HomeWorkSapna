package hw8Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmNameString("Sapna Rani");
		employee.setEmAge(55);
		employee.setEmSex('F');
		employee.setEmCitizen(true);

		System.out.println("Employee Name: " + employee.getEmNameString() + "\nEmployee Age:" + employee.getEmAge()
				+ "\nEmployee Sex :" + employee.getEmSex() + "\nEmployee Citizen?" + employee.isEmCitizen());

	}

}
