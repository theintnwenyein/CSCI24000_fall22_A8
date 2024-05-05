import java.util.*;

public class Hunger extends Attribute{
	
	public static void main(String[] args){
		Hunger hunger = new Hunger();
	
	}// end main
	public Hunger(){
		super(); // calling the parent's constructor
		levels = new String[] {"Full", "Not very hungry", "Hungry", "Starving"};
	}// end constructor

}// end class
