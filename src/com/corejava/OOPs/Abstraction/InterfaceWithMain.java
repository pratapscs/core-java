package com.corejava.OOPs.Abstraction;

interface Flyable {
	void fly();
}

class Aeroplane implements Flyable {
	public void fly() {
		System.out.println("Aeroplane is flying");
	}
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	}
}

public class InterfaceWithMain 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Bird bird = new Bird();
		bird.fly();// Bird is flying

		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();// Aeroplane is flying

		// An interface reference variable can hold
		// objects of any implementation of interface
		Flyable flyable1 = new Bird();
		Flyable flyable2 = new Aeroplane();

	}

}
