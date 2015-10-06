package vending2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
public class Simulator{
	public void Simulate() throws EmptyListException{
		 FoodItemLinkedList<FoodItem> meat = new FoodItemLinkedList<FoodItem>();
		 FoodItemLinkedList<FoodItem> fruit = new FoodItemLinkedList<FoodItem>();
		 FoodItem sausage = new FoodItem();
		 FoodItem pepperoni = new FoodItem();
		 FoodItem pork = new FoodItem();
		 FoodItem chicken = new FoodItem();
		 FoodItem tomato = new FoodItem();
		 FoodItem apple = new FoodItem();
		 FoodItem orange = new FoodItem();
		 meat.delete();
		 if(meat.isEmpty()){
			 System.out.println("list is empty");
		 }
		 //showing off the meats
		 System.out.println("something not add up?");
		 	meat.Add(sausage);
		 	sausage.obtainFoodInfo(3, "Sausage", "meaty", "Medium", "well done");
		 	meat.Add(pepperoni);
		 	pepperoni.obtainFoodInfo(4, "pepperoni", "mmeaty", "small", "on pizza");
		 	meat.Add(pork);
		 	pork.obtainFoodInfo(4, "pork", "it's good", "small", "no salt");
		 	meat.Add(chicken);
		 	chicken.obtainFoodInfo(4, "chicken", "not the nugget", "Large", "not fried");
		 	System.out.println("before the delete");
		 	System.out.println(meat.toString());
		 	meat.delete();
		 	System.out.println("After Delete");
		 	
		 	System.out.println(meat.toString());
		 	if(meat.isEmpty()){
		 		System.out.println("list is empty");
		 	}
		 	else System.out.println("list is not empty");
		 	System.out.println("testing the search function. i shall now search for pork");
		 	System.out.println(meat.search("pork").DisplayFoodInfo());
		 	
		 	fruit.Add(orange);
		 	orange.obtainFoodInfo(5, "orange", "prevents scurvy", "medium", "no seedless");
		 	fruit.Add(apple);
		 	apple.obtainFoodInfo(6, "apple", "1 a day...", "small", "green ones");
		 	fruit.Add(tomato);
		 	tomato.obtainFoodInfo(9, "tomato", "king of fruits", "large", "extra juicy");
		 	
		 	System.out.println("time for the second round of foods");
		 	System.out.println();
		 	System.out.println(fruit.toString());
		 	System.out.println("okay, time to test Categories");
		 	System.out.println();
		 	
		 	//now to test out categories
		 	CategoryList<FoodItemLinkedList<FoodItem>> categories = new CategoryList<FoodItemLinkedList<FoodItem>>();
		 	categories.Add(fruit,"fruits");
		 
		 	categories.Add(meat,"meats");
		
		 	System.out.println(categories.toString());
		 	System.out.println("searching for fruits");
		 	
		 	System.out.println();
		 	System.out.println(categories.search("fruits"));
		 	/**
		 	 * now to save the items
		 	 */
		 	String filename = "CategoryList";
		 	try {
	       
	            byte[] buffer = categories.toString().getBytes();

	            FileOutputStream outputStream =
	                new FileOutputStream(filename);
	            outputStream.write(buffer);
	            outputStream.close();       
	            System.out.println("Wrote " + buffer.length + 
	                " bytes");
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error writing file '"
	                + filename + "'");
	        }
		 	
		 	
	}
		
	/*
	 * now for test classes 
	 */
	//change name to reflect that linked list is generic
	public<T> void addTest(FoodItemLinkedList<T> myList){
		FoodItem food = new FoodItem();
		food.obtainFoodInfo(Math.random(), String.valueOf(Math.random()),String.valueOf(Math.random()),String.valueOf(Math.random()),String.valueOf(Math.random()));
		myList.Add(food);
		System.out.println(myList.toString());
	}
	public<T> void deleteTest(FoodItemLinkedList<T> myList){
		try {
			myList.delete();
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myList.toString());
	}
	public<T> void stringTest(FoodItemLinkedList<T> myList){
		System.out.println(myList.toString());
	}
	//testing simulator
	public void Test(){
	FoodItemLinkedList<FoodItem> myList= new FoodItemLinkedList<FoodItem>();
	for(int i = 0; i<4; i++){
		System.out.println("times added: " + (i+1));
		System.out.println();
		addTest(myList);
	}
	System.out.println("now to Delete");
	System.out.println();
	deleteTest(myList);
	
	System.out.println("now for stringtest");
	System.out.println();
	stringTest(myList);
	
	
	}
	
	
	
}