package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import menu.MenuItem;
import menu.Order;

class OrderTest {
	
	private Order o;
	
	@BeforeEach
	public void setup() {
		o = new Order(0.10); 
	}
	
	@Test 
	void testAddItem() {
		MenuItem item = new MenuItem(2.50,"bagel"); 
		o.addItem(item);   // method1
		int items = o.getSize(); // method2    prefer testing just 1 method/test, but this time it's not useful.
		assertEquals(1,items); 
	}
	
	@Test
	void testComputeSubtotalNoItems() { // this test is 'edge-case' 
		double subtotal = o.computeSubtotal();
		assertEquals(0, subtotal, 0.05); 
	}
	
	
	@Test
	void testComputeSubtotal() {
		MenuItem item = new MenuItem(2.50, "bagel"); 
		o.addItem(item);
		
		double subtotal = o.computeSubtotal();
		
		assertEquals(2.50, subtotal, 0.05); 
	}
	
	@Test
	void testComputeSubtotalMultipleItems() {
		MenuItem item = new MenuItem(2.50, "bagel"); 
		MenuItem item2 = new MenuItem(3.50, "muffin");
		MenuItem item3 = new MenuItem(7.25, "half and half");
		o.addItem(item);
		o.addItem(item2);
		o.addItem(item3);
		double subtotal = o.computeSubtotal();
		assertEquals(13.25, subtotal, 0.05); 
	}
	
	@Test
	void testComputeTax() {
		MenuItem item = new MenuItem(2.50, "bagel"); 
		MenuItem item2 = new MenuItem(3.50, "muffin");
		
		o.addItem(item);
		o.addItem(item2);
		double computedTax = o.computeTax(); 
		assertEquals(0.60, computedTax, 0.05); 
	}
	
	@Test
	void testComputeTaxEmptyOrder() {
		double computedTax = o.computeTax(); 
		assertEquals(0, computedTax, 0.05); 
	}
	
	
	
	
	

}
