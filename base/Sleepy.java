import java.util.*;
import java.io.*;

public class Sleepy extends Attribute{
	public static void main(String[] args){
		Sleepy s = new Sleepy();
	}// end main

	public Sleepy(){
		super();
		levels = new String[]{"not sleepy at all", "still active", "starting to get tired", "exhausted"};
	}// end constructor
}// end class
