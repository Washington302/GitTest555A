import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
/*
	@BeforAll
	
	
	@AfterAll
	
	@beforeEach
	
	@AfterEach
*/
	
	@Test
	void testAdd() {

		Calculator calc = new Calculator();
		if (calc.add(1, 5) != 6) {
			fail("Not yet implemented");	
		}		
	}
	@Test
	void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(calc.subtract(7, 5),2);

	}
	@Test
	void testMultiply() {

		Calculator calc = new Calculator();
		assertEquals(calc.multiply(2, 5),10);
				
	}
	
	@Test
	void testDivide() {

		Calculator calc = new Calculator();
		assertEquals(calc.divide(10, 5),2);
			
	}
	
	/*	assertNotEquals(false,true);
	assertNull();
	assertNotNull();
	assertTrue();
	assertFalse();
	*/
	//if (Calculator.subtract(7, 5) != 2) {
	//	fail("Not yet implemented");	
	//}		
	

}
