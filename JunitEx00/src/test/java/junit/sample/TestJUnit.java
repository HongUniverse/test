package junit.sample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestJUnit {

	
	@Test
	@Ignore 	//�׽�Ʈ���� ����
	public void test() {
		String str = "Junit is working fine.";
		
		assertEquals("Junit is working fine.", str);
	}

}
