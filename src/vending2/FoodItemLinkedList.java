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
			
		this.tail.setPointer(Food);
		}
	tail = Food;
}
/**
 * removes a node from the fooditemlist
 */
public FoodItem delete(String name) throws EmptyListException{
	FoodItemNode<FoodItem> search = head;
	head = search;
	String item = "";
	FoodItem delete = null;
	
	if(isEmpty()){
		throw new EmptyListException("there is nothing to remove");
	}
	else{
		
		while(search!= null && !(item.equals(name))){
			item = search.fooddata.name;
			if(item.equals(name)){
				search.fooddata = delete;
				
				this.tail = search.getPointer();
			}
			else{
				search = search.getPointer();
				
			}
		}
	}
	return search.fooddata;
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
	while(Food!=null){
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
