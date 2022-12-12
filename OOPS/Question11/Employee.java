package OOPS.Question11;

import java.util.Date;

public class Employee {

	private int emp_id;
	private String ename;
	private int emp_salary;
	private String eaddress;
	private Date emp_dob, emp_doj;

	public Employee(int emp_id, String ename, int emp_salary, String eaddress, Date emp_dob, Date emp_doj) {
		super();
		this.emp_id = emp_id;
		this.ename = ename;
		this.emp_salary = emp_salary;
		this.eaddress = eaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", ename=" + ename + ", emp_salary=" + emp_salary + ", eaddress="
				+ eaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
}
