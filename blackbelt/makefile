Hunger.class: Hunger.java Attribute.class
	javac Hunger.java

Happiness.class: Happiness.java Attribute.class
	javac Happiness.java

Sleepiness.class: Sleepiness.java Attribute.class
	javac Sleepiness.java

Anger.class: Anger.java Attribute.class
	javac Anger.java

Fear.class: Fear.java Attribute.class
	javac Fear.java

Attribute.class: Attribute.java
	javac Attribute.java

Pet.class: Pet.java
	javac Pet.java

Dog.class: Dog.java Pet.class
	javac Dog.java

Cat.class: Cat.java Pet.class
	javac Cat.java

Rabbit.class: Rabbit.java Pet.class
	javac Rabbit.java

Dragon.class: Dragon.java Pet.class
	javac Dragon.java

Lion.class: Lion.java Pet.class
	javac Lion.java

Hamster.class: Hamster.java Pet.class
	javac Hamster.java

Homepage.class: Homepage.java Dog.class Cat.class Rabbit.class Hamster.class Lion.class Dragon.class
	javac Homepage.java

run: Homepage.class
	java Homepage

clean:
	rm *.class
