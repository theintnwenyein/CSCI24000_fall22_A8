import java.util.*;
import java.io.*;

public class Dog extends Pet{
	int option;

	public static void main(String[] args){
		Dog d = new Dog();
	}// end main

	public void testing(){
		Scanner input = new Scanner(System.in);
		setName("Woof");
		setAge(3);
		setType("Husky");
		System.out.println("\n");	
		speak();
		menu();
		switch(answer){
			case 1: 
				play();
				break;
			case 2:
				feed();
				break;
			case 3:
				rename();
				break;
			case 4:
				sleep();
				break;
			case 5:
				getEmotions();
				break;
			case 6:
				storePet();
				System.out.println("Have a great day.");
				break;
		}// end switch
	}// end testing()

	public void ask(){
		testing();
		while( answer >= 1 && answer <= 5){

			Scanner input = new Scanner(System.in);
			System.out.println("\n" + "Do you want to do something with your pet today?");
			System.out.println("1) Yes   0) No");
			System.out.print("Please enter your choice: ");
			option = input.nextInt();
			if(option == 1){
				testing();
			}
			else{
				System.out.println("Have a great day.");
				answer = 0;
			}
		}// end if
	}// end ask()
	
	public void speak(){
		System.out.println("Bark! Bark!");
	}
	
	public void storePet(){
		                try{
					FileOutputStream fos = new FileOutputStream("store.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(this);
					oos.close();
				}catch(Exception e){
					e.printStackTrace();
				}// end catch
	}// end storePet()
}// end clas
