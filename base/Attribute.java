import java.util.*;
import java.io.*;

public abstract class Attribute implements Serializable{
	int indicator;
	int min_indicator;
	int max_indicator;
	String levels[];

	Attribute(){
		this.max_indicator = 3; // Full, Not very hungry, Hungry, Starving
		this.indicator = 1;
		this.min_indicator = 0;
	}// end constructor

	public String getLevel(){
		return levels[indicator];
	}
	
	public int getIndicator(){
		return this.indicator;
	}

	public void increase(){
		if(this.indicator < this.max_indicator){
			this.indicator += 1;
		}// end if
		else{
			System.out.println("Your pet needs to be recharged.");
		}
	}// end increase()

	public void decrease(){
		if(this.indicator > 0 && this.indicator < this.max_indicator + 1){
			this.indicator -= 1;
		}
		else{
			System.out.println("Your pet is at its maximum state.");
		}
	}// end decrease()
}// end class
