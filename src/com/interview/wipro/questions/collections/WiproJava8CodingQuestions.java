package com.interview.wipro.questions.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Vector;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WiproJava8CodingQuestions {

public static void main(String[] args) {
	List<Employee> empList=new ArrayList<Employee>();
	createEmployeeList(empList);
	
//	print min/max salary
	Optional<Employee> maxSal =empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	Optional<Employee> minSal =empList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));

	System.out.println("Max Sal");
	System.out.println(maxSal);
	System.out.println("Min Sal");
	System.out.println(minSal);
	
//	max salary group by department
	System.out.println("======Max salary group by department==========");
	Map<String, Optional<Employee>> maxSalGroupByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
	maxSalGroupByDept.forEach((key,value)->System.out.println(key+":"+value));
//	min salary group by department
	System.out.println("======Min salary group by department==========");
	Map<String, Optional<Employee>> minSalGroupByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.reducing(BinaryOperator.minBy(Comparator.comparingDouble(Employee::getSalary)))));
	minSalGroupByDept.forEach((key,value)->System.out.println(key+":"+value));	
	
	
//	print count active and inactive 
	
	Map<String, Long> countByActiveIncative = empList.stream().collect(Collectors.groupingBy(Employee::getActive,Collectors.counting()));
	System.out.println("======print count active and inactive==========");
	countByActiveIncative.forEach((key,value)->System.out.println(key+":"+value));
	
//	print working employees in each department
	
	 Map<String, List<Employee>> workingEmployeesInEachDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	System.out.println("======Working employees in each department==========");
	workingEmployeesInEachDept.forEach((key,value)->System.out.println(key+":"+value));
		

}


private static void createEmployeeList(List<Employee> empList) {
	empList.add(new Employee(1, "name1", 25, "Y", "IT", 2015, 35000));
	empList.add(new Employee(2, "name2", 22, "N", "NW", 2012, 31000));
	empList.add(new Employee(3, "name3", 25, "Y", "HR", 2013, 27500));
	empList.add(new Employee(4, "name4", 26, "Y", "MKT", 2015, 26800));
	empList.add(new Employee(5, "name5", 21, "N", "IT", 2016, 35000));
	empList.add(new Employee(6, "name6", 28, "Y", "NW", 2015, 25763));
	empList.add(new Employee(7, "name7", 27, "Y", "MKT", 2020, 35000));
	empList.add(new Employee(8, "name8", 29, "N", "HT", 2015, 25367));
	empList.add(new Employee(9, "name9", 22, "Y", "IT", 2017, 35000));
	empList.add(new Employee(10, "name10", 24, "Y", "IT", 2019, 34268));
	empList.add(new Employee(11, "name11", 26, "N", "NW", 2018, 23568));
	empList.add(new Employee(12, "name12", 28, "Y", "IT", 2017, 24356));
	empList.add(new Employee(13, "name13", 27, "N", "IT", 2019, 37542));
	empList.add(new Employee(14, "name14", 23, "N", "IT", 2019, 35694));
	empList.add(new Employee(15, "name15", 24, "Y", "IT", 2013, 37854));
	empList.add(new Employee(16, "name16", 30, "Y", "IT", 2017, 31645));
	
}
}
