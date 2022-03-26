package menu;

public class MenuItem {
	private double price;
	private String name; 
	
	public MenuItem(double price, String name) {
		this.price = price;
		this.name = name; 
		
	}
	
	// any class with just getters and setters are called 'bins' 
	// but you should make tests for getters and setters still. 
	public double getPrice() {
		return price; 
	}
	public String getName() {
		return name; 
	}
}
