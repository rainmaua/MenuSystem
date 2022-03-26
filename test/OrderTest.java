package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.MenuItem;
import menu.Order;

class OrderTest {

	@Test 
	void testAddItem() {
		Order o = new Order();
		MenuItem item = new MenuItem(2.50,"bagel"); 
		o.addItem(item);   // method1
		int items = o.getSize(); // method2    prefer testing just 1 method/test, but this time it's not useful.
		assertEquals(1,items); 
	}
	
	@Test
	void testComputeSubtotalNoItems() { // this test is 'edge-case' 
		Order o = new Order();
		double subtotal = o.computeSubtotal();
		assertEquals(0, subtotal, 0.05); 
	}
	
	
	@Test
	void testComputeSubtotal() {
		Order o = new Order();
		MenuItem item = new MenuItem(2.50, "bagel"); 
		o.addItem(item);
		
		double subtotal = o.computeSubtotal();
		
		assertEquals(2.50, subtotal, 0.05); 
	}
	
	@Test
	void testComputeSubtotalMultipleItems() {
		Order o = new Order();
		MenuItem item = new MenuItem(2.50, "bagel"); 
		MenuItem item2 = new MenuItem(3.50, "muffin");
		MenuItem item3 = new MenuItem(7.25, "half and half");
		o.addItem(item);
		o.addItem(item2);
		o.addItem(item3);
		double subtotal = o.computeSubtotal();
		assertEquals(13.25, subtotal, 0.05); 
	}
	
	
	
	
	
	
	

}
