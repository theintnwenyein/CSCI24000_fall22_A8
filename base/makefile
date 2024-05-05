Homepage.class: Homepage.java Dog.class
	javac Homepage.java

Dog.class: Dog.java Pet.class
	javac Dog.java

Pet.class: Pet.java Hunger.class Happiness.class Sleepy.class
	javac Pet.java

Hunger.class: Hunger.java Attribute.class
	javac Hunger.java

Happiness.class: Happiness.java Attribute.class
	javac Happiness.java

Sleepy.class: Sleepy.java Attribute.class
	javac Sleepy.java

Attribute.class: Attribute.java
	javac Attribute.java

run: Homepage.class
	java Homepage

clean: 
	rm *.class
