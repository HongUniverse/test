package junit.annotation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}

	@Before
	public void beforeMethod() {
		System.out.println("@Before - 각 테스트 수행 전 실행");
	}
	
	@After
	public void afterMethod() {
		System.out.println("@After - 각 테스트 수행 후 실행");
	}
	
	@Test
	public void test_method01() {
		System.out.println("@Test - 테스트 메소드1");
	}
	
	@Test
	public void test_method02() {
		System.out.println("@Test - 테스트 메소드2");
	}
	
	@Ignore
	public void ignoreTest() {
		System.out.println("테스트 제외됨.");
	}
}
