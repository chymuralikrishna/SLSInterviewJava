package com.sls.interview;

public class CoreJavaOOPsDemo {
public static void main(String[] args) {
	
	
/*	Abstraction
	Abstraction is the process of hiding implementation details while showing only the necessary information to the user. In Java, abstraction can be achieved using abstract classes and interfaces.
	Abstract class:*/

	abstract class Animal {
	    public abstract void makeSound();
	}

	class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("Bark");
	    }
	}

	Animal animal = new Dog();
	animal.makeSound(); // Output: Bark
	/* Interface: */

	
	
	interface Animal {
	    void makeSound();
	}

	class Dog implements Animal {
	    public void makeSound() {
	        System.out.println("Bark");
	    }
	}

	Animal animal = new Dog();
	animal.makeSound(); // Output: Bark
	
	
	/*Encapsulation
	Encapsulation is the process of wrapping data and methods that operate on data within a single unit. In Java, encapsulation can be achieved by using access modifiers (public, private, protected) and getter/setter methods.
	*/
	
	class Student {
	    private String name;
	    private int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	}

	Student student = new Student();
	student.setName("John");
	student.setAge(20);
	System.out.println(student.getName()); // Output: John
	System.out.println(student.getAge()); // Output: 20
	
	
	/*Inheritance
	Inheritance is the process of creating a new class that inherits properties and behaviours of an existing class. In Java, inheritance can be achieved by using the extends keyword.
	*/
	
	class Animal {
	    public void makeSound() {
	        System.out.println("Animal sound");
	    }
	}

	class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("Bark");
	    }
	}

	Animal animal = new Dog();
	animal.makeSound(); // Output: Bark
	
	
	/*Polymorphism
	Polymorphism is the process of having multiple forms of a single object. In Java, polymorphism can be achieved by method overloading and method overriding.
	Method overloading:*/

	
	
	class Calculator {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	}

	Calculator calculator = new Calculator();
	System.out.println(calculator.add(2, 3)); // Output: 5
	System.out.println(calculator.add(2, 3, 4)); // Output: 9
	
	
	/*Method overriding:*/
		
	class Animal {
	    public void makeSound() {
	        System.out.println("Animal sound");
	    }
	}

	class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("Bark");
	    }
	}

	Animal animal = new Dog();
	animal.makeSound(); // Output: Bar
}
}
