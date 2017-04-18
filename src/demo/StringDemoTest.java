package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {

	private  StringDemo str ;
	@Before
	public void setUp() throws Exception {
		str = new StringDemo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringDemo() {
		assertEquals("zifuchuandoudaxie",str.smallString("ABCDEF"),"abcdef");
	}

	@Test
	public void testSmallString() {
		assertEquals("one word",str.smallString("A"),"a");
	}

	@Test
	public void testObject() {
		assertEquals("include small",str.smallString("aBc"),"abc");
	}

	@Test
	public void testGetClass() {
		assertEquals("include number",str.smallString("A1C"),"a1c");
	}

	@Test
	public void testHashCode() {
		assertEquals("all numbers",str.smallString("123"),"123");
	}

	@Test
	public void testEquals() {
		assertEquals("include special word",str.smallString("，ABCDEF"),"，abcdef");
	}

	@Test
	public void testClone() {
		assertEquals("special deal",str.smallString(""),"error");
	}

	@Test
	public void testToString() {
		assertEquals("all special",str.smallString("/。，、]"),"/。，、]");
	}

	@Test
	public void testNotify() {
		assertEquals("include null",str.smallString("AB C"),"ab c");
	}

	@Test
	public void testNotifyAll() {
		assertEquals("include null",str.smallString("AB C"),"ab c");
	}



}
