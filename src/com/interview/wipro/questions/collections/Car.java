package com.interview.wipro.questions.collections;

public class Car extends Vechicle {
	int maxSpeed=120;
	
	void display() {
		System.out.println(maxSpeed);
	}
	
	void printMaxSpeed() {
		display();
		super.display();
	}

}
