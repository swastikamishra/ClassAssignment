package com.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Testcases for calculator")
class CalculatorTest {

	 Calculator cal;
	
	@BeforeAll
	 void setUp()
	{
		cal=new Calculator();
		System.out.println("calculator object is created");
	}
	
	@AfterAll
	 void tearDown()
	{
		cal=null;
		System.out.println("After all method,object will garbage collected");
	}
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("before each test method");
	}
	
	@AfterEach
	void afterEach()
	{
		System.out.println("after each test method");
	}
	
	@Test
	@DisplayName("Testing factorial method")
	@EnabledForJreRange(min = JRE.JAVA_8,max = JRE.JAVA_15)
	//@RepeatedTest(value=3)
	@RepeatedTest(3)
	void factorialTest()
	{
	System.out.println("inside factorial method");
		assertEquals(120, cal.factorial(5));
	}
	
	@Nested
	@DisplayName("Testcases for ArithmaticOperation")
	class ArithmaticOperation
	{
		@Test
		@EnabledOnOs(value = {OS.WINDOWS,OS.LINUX})
		void addTest()
		{
			boolean status=true;
			assumeTrue(status);
			assertEquals(30.1f, cal.add(10.1f, 20.0f),"This method will add two float numbers");
		}
		
		@Test
		@DisabledOnOs(value = {OS.WINDOWS})
		void didvideTest()
		{
			int a=1;
			//assumeFalse(a!=0); //condition has to be false,but it became true
			assumeFalse(a==0); //condition has to be false,and the cond.is also false
			//if above assumption is false,then test case will proceed,else abort
			assertThrows(ArithmeticException.class,
					()->cal.divide(12, 0),"dividee by zero should thrown");
		}
		
		@Test
		@DisplayName("addition two positive integer")
		
		void testAddTwoPosistiveInt()
		{
			System.setProperty("id", "12");
			
			assumeTrue("13".equals(System.getProperty("id")),
					CalculatorTest::message);
			//if above assumptions is true,then test will execute,else abort
			assertEquals(120, cal.addTwoPosistiveInt(30, 90));
		}
		
		@Test
		@DisplayName("multiplying two double value")
		@EnabledOnJre(value = {JRE.JAVA_8} )
		 void testMultiply()
		 {
			 //assertEquals(159.9,cal.multiply(12.3,  13.0));
			//will do multiple test assert
			assertAll(
					()->assertEquals(4.0, cal.multiply(2.0, 2.0)),
					()->assertEquals(0.0, cal.multiply(0.0, 2.0)),
					()->assertEquals(-4.0, cal.multiply(-2.0, 2.0))
					);
			
		 }
	}
	
    @Test
	void testFindMax()
	{
		//int arr[]=new int[] {12,34,1,45,9};
		assertEquals(45, cal.findMax(new int[] {12,34,1,45,9}));
	}
    
    
    @Test
    void testSearchElement()
    {
    	//assertTrue(cal.searchElement(new int[] {12,34,1,45,9}, 34));
    	assertTrue(cal.searchElement(new int[] {12,34,1,45,9}, 14), 
    			"data not found");
    }
	
	private static String message()
	{
		return "Test execution is failed";
	}
	
	@Test
	public void test()
	{
		int num=6;
		String name="anurag";
		//check false condition-asserting condition will be false
		assertFalse(num>10);
		//check true condition-asserting condition will be true
		assertTrue(num<10);
		 assertNotEquals(-1, cal.searchElement2(new int[] {12,34,1,45,9}, 34));
	      //assertNull(name);//we are asserting supplier data should be null
	      assertNotNull(name);
	     
	      int actual[]= {34,56,12,1};
	      int expected[]= {1,12,34,56};
	      assertArrayEquals(expected, cal.bubbleSort(actual));
	}
	
	@Test
	@Disabled
	void testDisabled()
	{
		fail("this test should be disabled");
	}
	
}
