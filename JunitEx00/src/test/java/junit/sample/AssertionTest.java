package junit.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTest {

	@Test
	public void test() {
		//테스트 데이터 
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		int val1 = 5;
		int val2 = 6;
		
		//두 객체의 값이 일치하는지 테스트 
		assertEquals(str1, str2);
		
		//조건이 true인지 테스트 
		assertTrue(val1 < val2);
		
		//조건이 false인지 테스트 
		assertFalse(val1 > val2);
		
		//객체가 null인지 테스트 
		assertNotNull(str3);
	}

}
