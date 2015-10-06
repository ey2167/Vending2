package vending2;

public class EmptyListException extends Exception {
EmptyListException(String Message){
	super(Message);
	System.out.println(Message);
}
}
