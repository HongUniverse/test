package junit.suite.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest1 {

	@Test
	public void test() {
		String str = "Junit is working file.";
		String temp = null;
		
		assertEquals("Junit is working file.", str);
		assertNull(temp);
	}

}
