package JUNIT.INTERMEDIATE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Question2Test {

	Question2 ques = new Question2("java Developer");
	Question2 ques1 = new Question2("   HELLO   ");

	@Test
	public void testCharAt() {
		assertEquals('v', ques.getCharAt(2));
	}

	@Test
	public void testStringLength() {
		assertEquals(14, ques.getLength());
	}

	@Test
	public void testEndsWith() {
		assertTrue(ques.getEndsWith("r"));
	}

	@Test
	public void testEquals() {
		assertTrue(ques.checkEquals("java Developer"));
	}

	@Test
	public void testEqualsIgnoreCase() {
		assertTrue(ques.checkEqualsIgnoreCase("JAVA DEVELOPER"));
	}

	@Test
	public void testIndexOf() {
		assertEquals(2, ques.getIndexOf('v'));
	}

	@Test
	public void testLastIndexOf() {
		assertEquals(7, ques.getLastIndexOf('v'));
	}

	@Test
	public void testContains() {
		assertTrue(ques.checkContains("Dev"));
	}

	@Test
	public void testSubstring() {
		assertEquals("java d", "java developer".substring(0, 6));
	}

	@Test
	public void testToLowerCase() {

		assertEquals("java developer", ques.changeToLowerCase());
	}

	@Test
	public void testToUpperCase() {
		assertEquals("JAVA DEVELOPER", ques.changeToUpperCase());
	}

	@Test
	public void testTrim() {
		assertEquals("HELLO", ques1.doTrim());
	}

	@Test
	public void testConcat() {
		assertEquals("java Developer Appended", ques.doConcat(" Appended"));
	}
}

