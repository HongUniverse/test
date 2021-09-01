package junit.suite.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.green.biz.Calculator;

public class JunitTest2 {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		
		assertEquals(5, calc.sum(2, 3));
	}
	
	
}
