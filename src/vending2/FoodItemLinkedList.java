package vending2;

public class FoodItemLinkedList<T> {
private FoodItemNode<FoodItem> head;
private FoodItemNode<FoodItem> tail;
private String name;
FoodItemLinkedList(){
	setHead(null);
}
/**
 * 
 * @param fooditem
 * adds a node into the fooditemlist
 */
public void Add(FoodItem fooditem){
	
	FoodItemNode<FoodItem> Food = new FoodItemNode<FoodItem>(fooditem);
	
	if(isEmpty()){
		this.head = Food;
	}
	else{
			
			while(Food.getPointer()!= null){
		 Food = Food.getPointer();
		 System.out.println("test");
			}
	
			this.tail.setPointer(Food);
			
	}
	System.out.println("testing");
	this.tail = Food;
}
/**
 * removes a node from the fooditemlist
 */

//work on this...and binary....and javafx....
public void delete() throws EmptyListException{
	FoodItemNode<FoodItem> search = head;
	FoodItemNode<FoodItem> prev = search;
	try{
		if(isEmpty()){
			throw new EmptyListException("there is nothing to remove");
		}
		while(search.getPointer()!= null){
			prev = search;
			search = search.getPointer();
		}
	
		search.fooddata = null;
		search.pointer = null;
		this.tail = prev;
		
		
	}catch(EmptyListException e)
	{
		e.getMessage();
		}

}


public FoodItem search(String item) throws EmptyListException{
	FoodItem storage = null;
	FoodItemNode<FoodItem> search = head;
	head = search;
	String item1 = "";
	
	
	if(isEmpty()){
		throw new EmptyListException("there is nothing to remove");
		
	}
	else{
		
		while(search!= null && !(item1.equals(item))){
			item1 = search.fooddata.name;
			if(item1.equals(item)){
				storage = search.getFooddata();
			}
			else{
				search = search.getPointer();
				
			}
		}
	}
	return storage;
	
}

public String toString(){
	FoodItemNode<FoodItem> Food = this.head;
	String records = "";
	while(Food!=null && Food.fooddata != null){
	records += Food.getFooddata().DisplayFoodInfo();
	
	Food = Food.getPointer();
	
	}
	return records;
}

public boolean isEmpty(){
	if(head == null){
		return true;
	}
	else
		return false;
}
public FoodItemNode<FoodItem> getHead() {
	return head;
}
public void setHead(FoodItemNode<FoodItem> head) {
	this.head = head;
}
public FoodItemNode<FoodItem> getTail() {
	return tail;
}
public void setTail(FoodItemNode<FoodItem> tail) {
	this.tail = tail;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
