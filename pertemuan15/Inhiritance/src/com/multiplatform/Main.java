package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	Fish Arwana =  new Fish("Arwana",10,2,2);
	Arwana.eat();
	Arwana.sleep();
	Arwana.move(5);

	Dog Harder = new Dog("spike",25,2,4,1);
	Harder.sleep();
	Harder.eat();
	Harder.move(7);
	Harder.move(5);

    }
}
