import java.util.*;

public class Happiness extends Attribute{
	public static void main(String[] args){
		Happiness happy = new Happiness();
	}// end main

	public Happiness(){
		super(); // calling the parent's constructor
		levels = new String[]{"Extremely happy", "Happy", "Feeling good","Sad"};
	}// end constructor

}// end class
