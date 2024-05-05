import java.util.*;
import java.io.*;

public abstract class Pet implements Serializable{
	String name;
	String newName;
	int age;
	Hunger h;
	Happiness p;
	Sleepiness s;
	Anger a;
	Fear f;
	AllPets type;
	int answer;
	int choice;

	public Pet(){
		h = new Hunger();
		p = new Happiness();
		s = new Sleepiness();
		a = new Anger();
		f = new Fear();
	}// end constructor
	
	// Abstract methods
	public abstract void makeSound();
	public abstract void storePet();
	
	public void menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to do with your pet today?");
		System.out.println("\n");
		System.out.println("1) Feed 	      2) Play 	       3) Rename        4) Sleep            	     5) Dance");
		System.out.println("6) Watch a movie  7) Go on a date  8) Take selfies  9) Celebrate its birthday   10) Check its status   0) Exit" + "\n");
		System.out.print("Please enter your choice: ");
		answer = input.nextInt();
		while(answer > 10 || answer < 0){
			System.out.print("Please enter a valid number: ");
			answer = input.nextInt();
		}// end while
	}// end menu

	public void setName(String name){
		this.name = name;
	}// end setName

	public void setAge(int age){
		this.age = age;
	}// end age

	public void rename(){
		Scanner input = new Scanner(System.in);
		System.out.print("\n" + "Please enter a new name for your pet: ");
		newName = input.nextLine();
		this.name = newName;
		System.out.println("Success! Your pet name is now changed to " + this.name + ".");
	}// end rename

	public void feed(){
		System.out.println("\n" + "Feeding the pet...");
		System.out.println("Hunger level decreased by 1");
		h.decrease();
		System.out.println("\n" + this.name + "'s current hunger level: " + h.getLevel());
	}// end feed

	public void play(){
		System.out.println("\n" + "Playing with the pet...");
		System.out.println("Happiness level decreased by 1");
		System.out.println("Hunger level increased by 1");
		System.out.println("Sleepiness level increased by 1");

		p.decrease();
		h.increase();
		s.increase();
//		goBackToMenu();
		
	}// end play
	/*
	public void goBackToMenu(){
		Scanner input = new Scanner(System.in);

		System.out.println("\n" + "Please check the full status by going back to the main menu.");
		System.out.println("1) Go to the main menu	0) Do not go to the main menu");
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();

		while(choice != 1 && choice != 0){
			System.out.print("Please enter a valid number: ");
			choice = input.nextInt();
		}// end while

		if(choice == 1){
			menu();
		}// end if
	}// end goBackToMenu
*/
	public void sleep(){
		System.out.println("\n" + "Taking " + this.name + " to bed...");
		System.out.println("Sleepiness level decreased by 1");
		System.out.println("Fear level decreased by 1");
		System.out.println("Hunger level increased by 1");

		s.decrease();
		f.decrease();
		h.increase();
		//goBackToMenu();
	}// end sleep

	public void dance(){
		Scanner input = new Scanner(System.in);

		System.out.println("Please choose a song first to dance.");
		System.out.println("0) Glory Sunday: decreases Happiness level by 0");
		System.out.println("1) Shake it Off: decreases Happiness level by 1");
		System.out.println("2) Party In the USA: decreases Happiness level by 2");
		System.out.println("3) Baby Shark: decreases Happiness level by 3");
		System.out.print("\n" + "Which song would you like?: ");
		choice = input.nextInt();

		while(choice < 0 || choice >= 4){
			System.out.print("Please enter a valid number: ");
			choice = input.nextInt();
		}// end while	

		switch(choice){
			case 0:
				System.out.println("Dancing with Glory Sunday now!");
				s.increase(); // Sleepiness increases by 1
				h.increase(); // Hunger increases by 1
				f.decrease(); // Fear decreases by 1
				a.decrease(); // Anger decreases by 1
				break;
			case 1:
				System.out.println("Dancing with Shake it Off now!");
				p.decrease();
				s.increase();
				h.increase();
				f.decrease();
				a.decrease();
				break;
			case 2:
				System.out.println("Wooh! Dancing with Party In the USA now!");
				for(int i = 0; i < choice; i++){
					p.decrease();
				}// end for
				s.increase();
				h.increase();
				f.decrease();
				a.decrease();
				break;
			case 3:
				System.out.println("Yayy! Dancing with Baby Sharks now!");
				for(int i = 0; i < choice; i++){
					p.decrease();
				}// end for
				s.increase();
				h.increase();
				f.decrease();
				a.decrease();
		}// end switch
		//goBackToMenu();
	}// end dance

	public void watchMovie(){
		Scanner input = new Scanner(System.in);

		System.out.println("Please choose a movie first.");
		System.out.println("0) Annabelle: Happiness level decreases by 0 and Fear level increases by 2");
		System.out.println("1) Toys Story: Happiness level decreases by 1");
		System.out.println("2) Tom & Jerry: Happiness level decreases by 2");
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();

		while(choice >= 3 || choice < 0){
			System.out.println("Please enter a valid choice: ");
			choice = input.nextInt();
		}// end while

		switch(choice){
			case 0:
				System.out.println("Watching Annabelle with " + this.name);
				f.increase();
				f.increase();
				h.increase(); // Hunger level increases by 1
				// No increment of Sleepiness as this is a scary movie
				break;
			case 1:
				System.out.println("Watching Toys Story with " + this.name);
				for(int i =  0; i < choice; i++){
					p.decrease();
				}// end for
				s.increase(); // sleepiness level increases by 1
				h.increase();
				break;
			case 2:
				System.out.println("Ah Ha! Watching Tom & Jerry with " + this.name);
				for(int i = 0; i < choice; i++){
					p.decrease();
				}// end or
				// No increment of Sleepiness as this is every pet's favorite cartoon
				h.increase();
				break;
		}// end switch
	}// end watchMovie

	public void goOnADate(){
		System.out.println("Yayy! Going on a date with " + this.name);
		System.out.println("\n" + "Happiness level decreased by 1");
		System.out.println("Anger level decreases by 1");
		System.out.println("Fear level decreases by 1");
		System.out.println("Hunger level increases by 1");
		System.out.println("Sleepiness level increases by 1");

		p.decrease();
		a.decrease();
		h.increase();
		f.decrease();
		s.increase();

		//goBackToMenu();
	}// end goOnADate

	public void takeSelfies(){
		System.out.println("Taking selfies with " + this.name + "!");
		System.out.println("\n" + "Fear level decreased by 1");
		System.out.println("Hunger level increased by 1");
		System.out.println("Happiness level decreased by 1");

		f.decrease();
		h.increase();
		p.decrease();

		//goBackToMenu();
	}// end takeSelfies

	public void celebrateBirthday(){
		System.out.println("Yayy! Even " + this.name + " has grown up!");
		this.age += 1;
		System.out.println(this.name + " is now " + this.age + " years old!");
	}// end celebrateBirthday

	public void checkStatus(){
		System.out.println("\n" + "Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Happiness Level: " + p.getLevel());
		System.out.println("Hunger Level: " + h.getLevel());
		System.out.println("Sleepiness Level: " + s.getLevel());
		System.out.println("Anger Level: " + a.getLevel());
		System.out.println("Fear Level: " + f.getLevel());
	}// end checkStatus
}// end class
