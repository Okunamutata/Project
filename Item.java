package project1;

public class Item {
///Fields
	String itemName; // TODO: This name is good; I generally don't repeat the enclosing type name, so would use "name".
	String cost;



	// TODO: Be consistent with field names and their associated constructor parameter names, e.g. either both cost or price.

	////constructor 
	public Item(String name, String price) {
		this.itemName = name;
		this.cost = price;
		
	}
	
	public static void main(String[] args) {}
	
}
