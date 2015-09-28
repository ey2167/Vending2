package vending2;

public class FoodItemNode<T> {
T fooddata;
FoodItemNode<T> pointer;


public T getFooddata() {
	return fooddata;
	
}
/**
 * constructors
 * 
 */
public FoodItemNode(T fooddata){
	this.fooddata = (T) fooddata;
	pointer = null;
}

public FoodItemNode(T fooddata, FoodItemNode<T> pointer){
	this.fooddata = (T) fooddata;
	this.pointer = pointer;
}

public void setFooddata(T fooddata) {
	this.fooddata = (T) fooddata;
}
public FoodItemNode<T> getPointer() {
	return pointer;
}
public void setPointer(FoodItemNode<T> pointer) {
	this.pointer = pointer;
}


}
