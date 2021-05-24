package com.corejava.OOPs.Inheritance;

abstract class Animal1 {
	String name;

	// cool functionality
	abstract String bark();
}

class Dog extends Animal1 {
	String bark() {
		return "Bow Bow";
	}
}

class Cat extends Animal1 {
	String bark() {
		return "Meow Meow";
	}
}

public class InheritanceExamples {
	
	public static void main(String[] args) {
		Animal1 animal = new Dog();
		System.out.println(animal.bark());
	}
}