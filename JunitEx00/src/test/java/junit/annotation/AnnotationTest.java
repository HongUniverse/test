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
		System.out.println("@Before - �� �׽�Ʈ ���� �� ����");
	}
	
	@After
	public void afterMethod() {
		System.out.println("@After - �� �׽�Ʈ ���� �� ����");
	}
	
	@Test
	public void test_method01() {
		System.out.println("@Test - �׽�Ʈ �޼ҵ�1");
	}
	
	@Test
	public void test_method02() {
		System.out.println("@Test - �׽�Ʈ �޼ҵ�2");
	}
	
	@Ignore
	public void ignoreTest() {
		System.out.println("�׽�Ʈ ���ܵ�.");
	}
}
