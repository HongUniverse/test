package junit.sample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestJUnit {

	
	@Test
	@Ignore 	//테스트에서 제외
	public void test() {
		String str = "Junit is working fine.";
		
		assertEquals("Junit is working fine.", str);
	}

}
