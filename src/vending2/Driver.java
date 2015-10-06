package vending2;
/**
 * Elohe Yonas
 * Assignment2
 */
import javafx.stage.Stage;

public class Driver {

 public static void main(String[]args) throws Exception{
	Simulator simulator = new Simulator();
	System.out.println("first, to test the methods");
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	simulator.Test();
	System.out.println();
	System.out.println();
	System.out.println("now to run a simulation of someone who put in values");
	System.out.println();
	System.out.println();
	System.out.println();
	simulator.Simulate();
	
	Gui gui = new Gui();
	
	
	//gui.start(new Stage());
	//simulator.Simulate();
	 
 }
 }

