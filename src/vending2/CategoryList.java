package vending2;

public class CategoryList<T> {
	private CategoryNode<FoodItemLinkedList<FoodItem>> head;
	private CategoryNode<FoodItemLinkedList<FoodItem>> tail;
	CategoryList(){
		setHead(null);
	}
	public CategoryNode<FoodItemLinkedList<FoodItem>> getHead() {
		return head;
	}
	public void setHead(CategoryNode<FoodItemLinkedList<FoodItem>> head) {
		this.head = head;
	}
	public CategoryNode<FoodItemLinkedList<FoodItem>> getTail() {
		return tail;
	}
	public void setTail(CategoryNode<FoodItemLinkedList<FoodItem>> tail) {
		this.tail = tail;
	}
	
	/**
	 * checks if category list is empty
	 */
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		else
			return false;
	}
	/**
	 * adds a categoryNode to the Category Linked List
	 * @param fooditem
	 */
	public void Add(FoodItemLinkedList<FoodItem> fooditem){
		CategoryNode<FoodItemLinkedList<FoodItem>> Cat = new CategoryNode<FoodItemLinkedList<FoodItem>>(fooditem);
		
		if(isEmpty()){
			this.head = Cat;
		}
		else{
				
			this.tail.setCatpointer(Cat);
			}
		tail = Cat;
	}
	/**
	 * searches for a specific category(FoodItemLinkedList) and returns it
	 */

public FoodItemLinkedList<FoodItem> search(String item) throws EmptyListException{
	FoodItemLinkedList<FoodItem> storage = null;
	CategoryNode<FoodItemLinkedList<FoodItem>> search = head;
	head = search;
	String item1 = "";
	if(isEmpty()){
		throw new EmptyListException("there is nothing to remove");
	}
	else{
		
		while(search!= null && !(item1.equals(item))){
			item1 = search.name;
			if(item1.equals(item)){
				storage = search.getFoodlink();
			}
			else{
				search = search.getCatpointer();		
			}
		}
	}
	return storage;
}
public String toString(){
	CategoryNode<FoodItemLinkedList<FoodItem>> Cat = this.head;
	String records = "";
	while(Cat!=null){
		if(Cat!=null){
	records += Cat.foodlink.getName() + ", ";
	Cat = Cat.getCatpointer();
		};
	}
	return records;
}
}
