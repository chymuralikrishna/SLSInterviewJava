package com.sls.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*32.	What is a Comparable interface? 
 * The Comparable interface is used to define the natural ordering of a class. 
 * It contains a single method, compareTo(), that is used to compare two objects.*/
public class ComparableDemo {
public static void main(String[] args) {
	
	List<Student> stds=new ArrayList<Student>();
	stds.add(new Student("mk", 10));
	stds.add(new Student("qweq", 3));
	stds.add(new Student("csdfq", 7));
	stds.add(new Student("jytradf", 2));
	Collections.sort(stds);
	for(Student std:stds) {
	System.out.println(std.getName()+":"+std.getAge());
	}
	
	stds.forEach((std)->{System.out.println(std.getName()+":"+std.getAge());});
	
}


}

class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student(String name,int age) {this.name=name;this.age=age;}
	
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

	@Override
	public int compareTo(Student o) {
		if(age==o.age) {
			return 0;
		}else if(age>o.age) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	
}