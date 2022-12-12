package OOPS.Question1;

import java.util.Date;

public class Question1 {

	public static void main(String[] args) {
		Department[] departmentList = { new Department(1, "IT"), new Department(2, "Mechanical"),
				new Department(3, "Electrical") };
		Customer customer = new Customer(1, "Raj Dhawan", "1 street, India", new Date(), new Date(), "1 street, India",
				"+916732783989", "b@xyz.com");
		Employee employee = new Employee(10000, new Date(), "Delhi", departmentList[0], "+917627374827", "a@xyz.com", 1,
				"Rahul Gupta", "Delhi, India", new Date());
		System.out.println(customer);
		System.out.println(employee);

	}

}
