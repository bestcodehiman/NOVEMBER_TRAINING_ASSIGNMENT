package JUNIT.Question3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Question3Test {
	Question3 obj = new Question3();

	@Test
	public void testFindEvenDigits() {
		assertEquals(3, obj.findEvenDigits(23437561));
	}
	
	@Test
	public void testFindOddDigits() {
		assertEquals(5, obj.findOddDigits(23437561));
	}
}
