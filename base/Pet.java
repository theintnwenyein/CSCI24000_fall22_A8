import java.util.*;
import java.io.*;

public abstract class Pet implements Serializable{
	String name;
	String newName;
	int age;
	Hunger h;
	Happiness p;
	Sleepy s;
	String type;
	int answer;
	
	public Pet(){
		h = new Hunger();
		p = new Happiness();
		s = new Sleepy();
	}
	
	public abstract void speak();
	public abstract void storePet();

	public void menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to do with your pet today?");
		System.out.println("1) Play  2) Feed  3) Rename  4) Sleep  5) Show the levels of emotions  6) Exit");
		System.out.print("Please enter your choice: ");
		answer = input.nextInt();
		while(answer <= 0 || answer > 6){
			System.out.print("Please enter a valid number: ");
			answer = input.nextInt();
		}// end while
		
		
	}// end menu

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setType(String type){
		this.type = type;
	}

	public void rename(){
		Scanner input = new Scanner(System.in);
		System.out.print("What is the new name of your pet?: ");
		newName = input.next();
		this.name = newName;
		System.out.println("Success! Your pet name is changed.");
	}

	public void play(){
		System.out.println("Playing with the pet...");
		p.decrease();
		h.increase();
		s.increase();

		System.out.println("Increased happiness level by 1");
		System.out.println("Decreased hunger level and sleepiness level by 1");
	}

	public void feed(){
		System.out.println("Feeding the pet...");
		h.decrease();
		System.out.println("Decreased hunger level by 1");
	}

	public void sleep(){
		System.out.println("Letting the pet sleep for a while...");
		s.decrease();
		System.out.println("Decreased sleepiness level by 1");
	}

	public void getEmotions(){
		System.out.println("Your pet's status is as follow: " + "\n");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Type: " + this.type + "\n");
		System.out.println("Level of hunger: " + h.getLevel() + " at " + h.indicator);
		System.out.println("Level of happiness: " + p.getLevel() + " at " + p.indicator);
		System.out.println("Level of sleepiness: " + s.getLevel() + " at " + s.indicator);
	}
}// end class
