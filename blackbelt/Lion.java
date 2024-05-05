import java.util.*;
import java.io.*;

public class Lion extends Pet{
	int option;
	AllPets type = AllPets.Lion;

	public static void main(String[] args){
		new Lion();
	}// end main

	public void makeSound(){
		System.out.println("Rahhhr!");
	}// end makeSound

	public void storePet(){
		try{
			FileOutputStream fos = new FileOutputStream("lionStore.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			fos.close();
		}// end try
		catch(Exception e){
			System.out.println("Failed to save!");
		}// end catch
	}// end storePet

	public void testing(){
		System.out.println("\n");

		makeSound();
		menu();
		switch(answer){
			case 1:
				feed();
				break;
			case 2:
				play();
				break;
			case 3:
				rename();
				break;
			case 4:
				sleep();
				break;
			case 5:
				dance();
				break;
			case 6:
				watchMovie();
				break;
			case 7:
				goOnADate();
				break;
			case 8:
				takeSelfies();
				break;
			case 9:
				celebrateBirthday();
				break;
			case 10:
				checkStatus();
				break;
			case 0:
				storePet();
				System.out.println("Have a great day.");
				break;
		}// end switch
	}// end testing

	public void ask(){
		Scanner input = new Scanner(System.in);

		testing();
		while(answer > 0 && answer <= 10){
			System.out.println("\n" + "Do you want to do something else with your pet today?");
			System.out.println("1) Yes, show me the menu again   0) No");
			System.out.print("Please enter your choice: ");
			option = input.nextInt();
			while(option != 1 && option != 0){
				System.out.print("Please enter a valid number: ");
				option = input.nextInt();
			}// end while
			if(option == 1){
				testing();
			}// end if
			else{
				System.out.println("Have a great day");
				answer = 0;
			}// end else
		}// end while
	}// end ask
}// end class
