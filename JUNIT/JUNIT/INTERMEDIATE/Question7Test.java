package JUNIT.INTERMEDIATE;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Question7Test {
	Question7 c = new Question7();

	@Test
	public void numberOfEmployee1() {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1, "ram", "SE"));
		l.add(new Employee(2, "anuj", "SSE"));
		l.add(new Employee(3, "nirmal", "SSE"));
		assertEquals(3, c.numberOfEmployee(l));
	}

	@Test
	public void numberOfEmployee2() {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1, "ram", "SE"));
		l.add(new Employee(2, "anuj", "SSE"));
		l.add(new Employee(3, "nirmal", "SSE"));
		assertEquals(2, c.numberOfEmployee(l));
	}
}
