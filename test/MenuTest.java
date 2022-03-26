package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import menu.MenuItem;
// price
// name
// calories
// allergens
// 
class MenuTest {
	private MenuItem item;  // since we're trying to access this variable in different methods, instance variable is created. 
	
	@BeforeEach
	void setup() {  // put first line in each test in setup. 
		item = new MenuItem(2.50, "bagel"); 
	}
	
	@Test // @ means annotation that tells Java this is a unit test. 
	void testGetPrice() {
		// Step0: write a test that fails. 
		// at this time, those variables are not created, but keep writing test. 
		//MenuItem item = new MenuItem(2.50, "bagel"); // Step1: setup   (set up conditions before my test)
		double price = item.getPrice(); // Step2: test a method (here testing getPrice() method)
		assertEquals(2.50, price, 0.05); // Step3: assert  (comparing doubles is tricky since in involve rounding issues)
//		assertEquals(double expected, double actual, double delta)
//        Asserts that two doubles or floats are equal to within a positive delta.
		
	}
	// one test per method is minimum, more complex method needs more tests. 
	@Test
	void testGetName() {
		//MenuItem item = new MenuItem(2.50, "bagel"); //no longer needed due to SetUp()
		String name = item.getName();
		assertTrue("bagel".equals(name)); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
