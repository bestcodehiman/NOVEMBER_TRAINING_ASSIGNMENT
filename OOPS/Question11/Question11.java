package OOPS.Question11;

import java.util.Date;

public class Question11 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Nitin", 23000, "pune", new Date(1967, 1, 23), new Date(1967, 1, 23));
		System.out.println(e1);

		Employee e2 = new Employee(2, "Xyz", 35000, "Mumbai", new Date(2001, 1, 10), new Date(1967, 1, 12));
		System.out.println(e2);

	}
}
