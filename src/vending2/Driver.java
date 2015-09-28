package vending2;
/**
 * Elohe Yonas
 * Assignment2
 */
import javafx.stage.Stage;

public class Driver {

 public static void main(String[]args) throws Exception{
	Simulator simulator = new Simulator();
	Gui gui = new Gui();
	
	//gui.start(new Stage());
	simulator.Simulate();
	 
 }
 }

