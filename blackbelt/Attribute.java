import java.util.*;
import java.io.*;

public abstract class Attribute implements Serializable{
	int indicator;
	int max_indicator;
	int min_indicator;
	String levels[];

	Attribute(){
		this.max_indicator = 3;
		this.indicator = 1;
		this.min_indicator = 0;
	}// end constructor

	public String getLevel(){
		return this.levels[this.indicator];
	}// end getLevel

	public int getIndicator(){
		return this.indicator;
	}// end getIndicator

	public void increase(){
		if(this.indicator < this.max_indicator){
			this.indicator += 1; // increase the level by 1
		}// end if
		else{
			System.out.println("Warning!! Your pet needs to be recharged.");
		}// end else
	}// end increase

	public void decrease(){
		if(this.indicator > this.min_indicator && this.indicator < this.max_indicator + 1){
			this.indicator -= 1;
		}// end if
		else{
			System.out.println("Your pet is at its maximum state.");
		}// end else
	}// end decrease
}// end class 
