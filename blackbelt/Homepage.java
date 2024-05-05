import java.util.*;
import java.io.*;

public class Homepage implements Serializable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int choice;
		Homepage home = new Homepage();

		System.out.println("Welcome! Are you creating a new pet or loading an existing one?");
		System.out.println("1) Create a new pet     2) Load my existing pet");
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();
		while( choice != 1 && choice != 2){
			System.out.print("Please enter a valid number: ");
			choice = input.nextInt();
		}// end while

		if(choice == 1){
			home.makePet();
		}// end if
		else{
			home.loadPet();
		}//end else
	}// end main

	public void makePet(){
		int choice;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of pet do you want to create?");
		System.out.println("1) Dog  2) Cat  3) Rabbit  4) Dragon  5) Hamster  6) Lion");
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();
		while(choice >= 7 && choice <= 0){
			System.out.print("Please enter a valid number: ");
			choice = input.nextInt();
		}// end while
		switch(choice){
			case 1:
				
				Dog d = new Dog();
				d.rename();
				d.setAge(1);
				d.ask();
				break;
				
			case 2:
				Cat c = new Cat();
			//	System.out.print("What is the name of your new cat?: ");
			//	name = input.nextLine();
			//	c.setName(name);
				c.rename();
				c.setAge(1);
				c.ask();
				break;
			case 3:
				Rabbit r = new Rabbit();
		//		System.out.print("What is the name of your new rabbit?: ");
		//		name = input.nextLine();
		//		r.setName(name);
				r.rename();
				r.setAge(1);
				r.ask();
				break;
			case 4:
				Dragon g = new Dragon();
				System.out.print("What is the name of your new dragon?: ");
				name = input.nextLine();
				g.setName(name);
				g.setAge(1);
				g.ask();
				break;
			case 5:
				Hamster h = new Hamster();
				System.out.print("What is the name of your new hamster?: ");
				name = input.nextLine();
				h.setName(name);
				h.setAge(1);
				h.ask();
				break;
			case 6:
				Lion l = new Lion();
				System.out.print("What is the name of your lion?: ");
				name = input.nextLine();
				l.setName(name);
				l.setAge(1);
				l.ask();
				break;
				
		}// end switch
	}// end makePet

	public void loadPet(){
		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Which pet do you want to load?");
		System.out.println("1) Dog  2) Cat  3) Rabbit  4) Dragon  5) Hamster  6) Lion");
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();
		while(choice >= 7 && choice <= 0){
			System.out.print("Please enter a valid number: ");
			choice = input.nextInt();
		}// end while

		switch(choice){
			case 1:
				loadDog();
				break;
			case 2:
				loadCat();
				break;
			case 3:
				loadRabbit();
				break;
			case 4:
				loadDragon();
				break;
			case 5:
				loadHamster();
				break;
			case 6:
				loadLion();
				break;
		}// end switch
	}// end loadPet

	public void loadDog(){
		int correct = 1;
		Dog d = new Dog();
		try{
			FileInputStream fis = new FileInputStream("dogStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog)ois.readObject();
			ois.close();
			fis.close();
		}// end try
		catch(Exception e){
			System.out.println("There is no saved dog! Please create a new dog first.");
			correct = 0;
		}// end catch

		if(correct == 1){
			System.out.println("Say hello to " + d.name + " back!");
			d.ask();
		}// end if
	}// end loadDog

	public void loadCat(){
		int correct = 1;
		Cat c = new Cat();
		try{
			FileInputStream fis = new FileInputStream("catStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat)ois.readObject();
			ois.close();
			fis.close();
		}// end try
		catch(Exception e){
			System.out.println("There is no saved cat! Please create a new cat first.");
			correct = 0;
		}// end catch

		if(correct == 1){
			System.out.println("Say hello to " + c.name + " back!");
			c.ask();
		}// end if
	}// end loadCat

	public void loadRabbit(){
		int correct = 1;
		Rabbit r = new Rabbit();
		try{
			FileInputStream fis = new FileInputStream("rabbitStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			r = (Rabbit)ois.readObject();
			fis.close();
			ois.close();
		}// end try
		catch(Exception e){
			System.out.println("There is no saved rabbit! Please create a new rabbit first.");
			correct = 0;
		}// enc catch

		if(correct == 1){
			System.out.println("Say hello to " + r.name + " back!");
			r.ask();
		}// end if
	}// end loadRabbit

	public void loadDragon(){
		int correct = 1;
		Dragon g = new Dragon();
		try{
			FileInputStream fis = new FileInputStream("dragonStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			g = (Dragon)ois.readObject();
			fis.close();
			ois.close();
		}// end try
		catch(Exception e){
			System.out.println("There is no saved dragon! Please create a new dragon first!");
			correct = 0;
		}// end catch

		if(correct == 1){
			System.out.println("Say hello to " + g.name + " back.");
			g.ask();
		}// end if
	}// end loadDragon

	public void loadHamster(){
		int correct = 1;
		Hamster h = new Hamster();
		try{
			FileInputStream fis = new FileInputStream("hamsterStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			h = (Hamster)ois.readObject();
			ois.close();
			fis.close();
		}// end try
		catch(Exception e){
			System.out.println("There is no saved hamster! Please create a new hamster first.");
			correct = 0;
		}// end catch

		if(correct == 1){
			System.out.println("Say hello to " + h.name + " back!");
			h.ask();
		}// end if
	}// end loadHamster

	public void loadLion(){
		int correct = 1;
		Lion l = new Lion();
		try{
			FileInputStream fis = new FileInputStream("lionStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			l = (Lion)ois.readObject();
			ois.close();
			fis.close();
		}// end try
		catch(Exception e){
			System.out.println("There is no saved lion! Please create a new lion first.");
			correct = 0;
		}// end catch

		if(correct == 1){
			System.out.println("Say hello to " + l.name + " back.");
			l.ask();
		}// end if
	}// end loadLion
}// end class
