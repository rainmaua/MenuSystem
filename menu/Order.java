package menu;

import java.util.LinkedList;
import java.util.List;

public class Order {
	
	private List<MenuItem> orderItems;
	
	public Order() {
		this.orderItems = new LinkedList<>();
	}
	
	public void addItem(MenuItem item) {
		orderItems.add(item);
	}
	
	public int getSize() {
		return orderItems.size(); 
	}
	
	public double computeSubtotal () {
		double sum = 0;    //testComputeSubtotalNoItems() when loop runs zero times
		for (MenuItem item: orderItems) { // testComputeSubtotal() when loop runs once 
			sum += item.getPrice(); // testComputeSubtotalMultipleItems() when loop runs 2~ times
		}
		return sum; 
	}
}
