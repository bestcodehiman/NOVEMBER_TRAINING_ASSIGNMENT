package JUNIT.INTERMEDIATE;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Question1Test {

	@Test
	public void testCharAt() {
		assertEquals('a', "abc".charAt(0));
	}

	@Test
	public void testConcat() {
		assertEquals("javadeveloper", "java".concat("developer"));
	}

	@Test
	public void testStringLength() {
		assertEquals(4, "java".length());
	}

	@Test
	public void testEndsWith() {
		assertTrue("java developer".endsWith("r"));
	}
	
	@Test
	public void testEquals() {
		assertTrue("java developer".equals("java developer"));
	}
	
	@Test
	public void testEqualsIgnoreCase() {
		assertTrue("java developer".equalsIgnoreCase("JAVA DEVELOPER"));
	}
	
	@Test
	public void testIndexOf() {
		assertEquals(2, "java developer".indexOf('v'));
	}
	
	@Test
	public void testIntern() {
		String s = new String("java");
        assertEquals(s, s.intern());
	}
	
	@Test
	public void testLastIndexOf() {
		assertEquals(7, "java developer".lastIndexOf('v'));
	}
	
	@Test
	public void testContains() {
		assertTrue("java developer".contains("dev"));
	}
	
	@Test
	public void testReplace() {
		assertEquals("java ueloper","java developer".replace("dev", "u"));
	}
	
	@Test
	public void testSplit() {
		assertEquals(2,"java developer".split(" ").length);
	}
	@Test
	public void testSubstring() {
		assertEquals("java d","java developer".substring(0, 6));
	}
	
	@Test
	public void testToLowerCase() {
		assertEquals("hello","HELLO".toLowerCase());
	}
	
	@Test
	public void testToUpperCase() {
		assertEquals("HELLO","heLLo".toUpperCase());
	}
	
	@Test
	public void testValueOf() {
		assertEquals("HELLO","   HELLO  ".trim());
	}
	
	@Test
	public void testTrim() {
		assertEquals("false",String.valueOf(false));
	}
}
