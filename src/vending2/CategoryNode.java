package vending2;

public class CategoryNode<T> {
String name;
T foodlink;
CategoryNode<T> catpointer;

/**
 * 
 * getters and setters of attributes
 */
public T getFoodlink() {
	return foodlink;
}

public void setFoodlink(T foodlink) {
	this.foodlink = foodlink;
	this.catpointer = null;
	
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public CategoryNode<T> getCatpointer() {
	return catpointer;
}

public void setCatpointer(CategoryNode<T> catpointer) {
	this.catpointer = catpointer;
}
/**
 * Constructors
 */
CategoryNode(){
}
CategoryNode(T foodlink,String name){
	this.foodlink = (T) foodlink;
	this.name = name;
	this.catpointer = null;
	
}
CategoryNode(T foodlink, CategoryNode<T> catnode){
	this.foodlink = (T) foodlink;
	catpointer = catnode;
}

CategoryNode(String name, T foodlink, CategoryNode<T> catnode){
	this.name = name;
	this.foodlink = (T) foodlink;
	catpointer = catnode;
}
}
