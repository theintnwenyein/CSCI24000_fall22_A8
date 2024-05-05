- A dog is already created so its information will return whenever loaded 

Goal: To make a pet with various attributes using abstraction

Input: User's choice whether to create a new pet or load an existing pet
	- If the user wants to create a new pet, the program will take the basic information of the new pet

Output: The pet's status, and actions after eating, sleeping, and playing

Steps:
- Make an abstract class for Attribute - which will be inherited to create the specific attributes classes such as 
Happiess, Hunger, and Sleepy

- Make an abstract class for Pet - which will be inherited to create a Dog class

- Make a Homepage class to put everything together as the main class of the program

- Make a makefile to link the files together with their dependencies


Attribute class (abstract)

- Goal: To have the common characteristics of every attribute the pet could have

- Input: Nothing from the user

- Output: Nothing on the console

- Steps: Refer to the UML and create necessary attributes and methods
	- an "indicator" to mark the current level of the attribute
	- a "max_indicator" and a "min_indicator" to mark the highest level and lowest level of the attribute
	- an array of string to express the meaning of each level of the attribute: levels[]

	- a constructor which will automatically sets the "indicator" to 1, "max_indicator" to 4 and "min_indicator" to 0 by default
	- getters for "indicator" and string expression of each level at a given indicator
	- methods to increase and decrease the value of "indicator"
		- Make sure to put the values within max and min range of the indicator

Hunger class, Sleepy class, and Happiness class (extend Attribute)

- Goal: To be the hunger characteristic, sleepiness characteristic, and happiness characteristic of the pet by extending Attribute abstract class

- Input: Nothing from the user

- Output: Nothing to the console

- Steps: Specify the different levels of hunger for levels[]: Full, Not very hungry, Hungry, Full in Hunger class
	Specify the different levels of sleepiness for levels[]: Active, Not sleepy, Tired, Exhausted
	Specify the different levels of happiness for levels[]: Very happy, Happy, Not very happy, Sad

Pet class (abstract)

- Goal: To be the parent class that every kinds of sepecific pet can be inherited from

- Input: Choices of user where necessary

- Output: Do not have its own output to the console without being inherited by a subclass

- Steps: Refer to the UML and create necessary attributes and methods
	- Every pet should have "name", type", and "age". It also should have "newName" for getting a new name.
	- The characteristics will be Hunger, Happiness, and Sleepy which will be instantiated.
	- An attribute "answer" to get the user's choice of menu

	- a constructor to instantiate the characteristics of the pet
	- setters for "name", "age", and "type"
	- an abstract method to make diffent voices of pets for different pets: speak()
	- a "menu" method to let the user choose what she wants to do with her pet, and store her choice in "answer"
	- a method to let the user rename the pet by asking the user a new name: rename()
	- a "play()" method which decreases the happiness level by 1, but increases the hunger level by 1
	- a "feed()" method which decreases the hunger level by 1
	- a "sleep()" method which decreases the sleepiness level by 1
	- a "getEmotions()" method to show the status of the pet including the current levels of characteristics 
	- an abstract method to store the pet in "store.txt" by using object serialization: storePet();

Dog class (extends Pet)

- Goals: To make a dog by inheriting the Pet class

- Input: Choices of user where necessary

- Output: Relevant output depending on the user's choice of menu

- Steps: Refer to the UML and create necessary attributes and methods
	- an "option" attribute for storing the user's choice
	- implement the abstract "speak()" method by printing "Bark! Bark!"
	- implement the abstract "storePet()" method by using object serialization and put it in "store.txt"
	- a "testing()" method to do different things depending on the user's input
		- call the "menu()"method from Pet class, use switch case on the value of "answer" (from the Pet class)
		- If the user wants to feed the pet, call "feed()" method, and "play()" and "sleep()" etc.
	- make a method: "ask()" to repeat asking the user until she wants to exit the program
	- call "storePet()" method once the user exists the program to save changes

Homepage class

- Goals: To be the main class of the program

- Input: Choices of user where necessary

- Output: Relevant output depending on the user's choice of menu

- Stpes: Refer to the UML and create necessary attributes and methods
	- "name" and "type" attributes for newly created pets (age is set by the default value)
	- Instantiate the Dog object
	- a "makePet()" method to create a new pet by asking new name and type of the dog
	- a "loadPet()" method to retrieve the saved object from "store.txt" by deserializing 
	- In the main method, ask the user whether she wants to 1) create a new pet or 2) load an existing pet
		- If it is 1, call makePet() method
		- If it is 2, call loadPet() method
		
