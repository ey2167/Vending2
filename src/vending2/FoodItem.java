package vending2;

public class FoodItem  {
public FoodItem(){
	
}
public FoodItem(String name, double price, int quantity, String description, String size, String specialorder){
	
}


protected double price;
protected String name;
protected String description;
protected String size;
protected String specialorder;
/**
* obtain food information from parameters
*/
protected void obtainFoodInfo(double price,String name, String description,String size, String specialorder){
this.name = name;
this.price = price;
this.description = description;
this.size = size;
this.specialorder = specialorder;
}
/**
* display the foodinformation
*/
protected String DisplayFoodInfo(){
	return String.format("Product Name: " + name + "\n" + "Price:" + price + "\n" + "Size:" + size 
			+ "\n" + "Description: " + description + "\n" + "Misc. " + specialorder + "\n" );

}
}
