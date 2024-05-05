import java.util.*;
import java.io.*;

public class Homepage implements Serializable{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int choice;
		Homepage home = new Homepage();

		System.out.println("Welcome! Are you creating a new pet or loading an existing one?");
		System.out.println("1) Create a new pet   2) Load my existing pet");
		System.out.print("Please enter your choice: ");
		choice = input.nextInt();
		if(choice == 1){
			home.makePet();

		}
		else if(choice == 2){
			home.loadPet();
		}// end if
	}// end main

	public void loadPet(){
		int correct = 1;
		Dog d = new Dog();
		try{
			FileInputStream fis = new FileInputStream("store.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog)ois.readObject();
			ois.close();
			fis.close();
		}// end try

		catch(Exception e){
			System.out.println(e.getMessage());
			correct = 0;
		}// end catch

		if(correct == 1){
			System.out.println("Say hello to " + d.name + " back!");
			d.ask();
		}// end if
	}// end loadPet()

	public void makePet(){
		Scanner input = new Scanner(System.in);
		String name;
		String type;
		Dog d = new Dog();
		System.out.print("What is your new pet's name?: ");
		name = input.nextLine();
		d.setName(name);
		System.out.print("What is the type of your pet?: ");
		type = input.nextLine();
		d.setType(type);
		d.setAge(1);
		System.out.println("Success! Your new pet's information are as follow: ");
		System.out.println("Name: " + d.name);
		System.out.println("Type: " + d.type);
		System.out.println("Age: " + d.age);

		d.ask();
	}// end makePet
}// end class
