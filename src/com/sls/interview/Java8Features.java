package com.sls.interview;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Features implements MyInterface {

	public static void main(String[] args) {
//		1. Lambda expressions: Lambda expressions provide a concise way to define anonymous functions. Here's an example of how you can use a lambda expression to sort a list of strings:
		System.out.println("1. Lambda expressions:");
		List<String> strings = Arrays.asList("foo", "bar", "baz");
		Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
		System.out.println(strings);
//2.Stream API:	The Stream API allows you to perform operations on collections in a more functional and declarative way. Here's an example of how you can use the filter and map operations to transform a list of strings:
		System.out.println("2.Stream API:");
		List<String> strings2 = Arrays.asList("foo", "bar", "ba77777z","1234");
		List<Integer> lengths = strings2.stream()
		                                .filter(s -> s.length() > 3)
		                                .map(String::length)
		                                .collect(Collectors.toList());
		System.out.println(lengths);

//3. Date and Time API: The Date and Time API provides a better way to work with dates, times, and time zones. Here's an example of how you can use the new API to parse and format dates:
		System.out.println("3. Date and Time API: ");
		LocalDate date = LocalDate.parse("2022-03-07");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = date.format(formatter);
		System.out.println(formattedDate);
//4.Default methods:
		System.out.println("4.Default methods:");
		new Java8Features().bar();
		
//5.Functional interfaces:
		System.out.println("5.Functional interfaces: ");
		MyFunction<Integer, String> function = (i) -> String.valueOf(i);
		 String result = function.apply(123);
		 System.out.println(result);
//6.Method references:		 Method references provide a way to refer to a method without invoking it. Here's an example of how you can use a method reference to sort a list of strings:
		 System.out.println("6.Method references");
		 List<String> strings6 = Arrays.asList("foo", "bar", "baz");
		 Collections.sort(strings6, String::compareTo);
		 System.out.println(strings6);
// 7.Optional:Optional is a new class that provides a way to handle null values in a more functional way. Here's an example of how you can use Optional to handle null values:
		 System.out.println("7. Optional");
		 Optional<String> optionalString = Optional.ofNullable(null);
		 System.out.println(optionalString);
		 List<String> listString = null;
		 System.out.println(listString);
		 
//		 8. Nashorn JavaScript engine: Java 8 includes a new JavaScript engine called Nashorn, which is faster and more efficient than the previous Rhino engine.
//		 9. Parallel array sorting: Java 8 introduced a new way to sort arrays in parallel, which can significantly improve the performance of sorting large arrays.
//		 10. Compact Profiles: Java 8 introduced compact profiles, which allow you to create smaller, more focused versions of the Java Runtime Environment (JRE) for use in embedded systems and other resource-constrained environments. 



	
	}

}
//4.Default methods:	Default methods allow you to add new functionality to an interface without breaking existing implementations. Here's an example of how you can use default methods to add a new method to an existing interface:

 interface MyInterface {
//    void foo();

    default void bar() {
        System.out.println("Default implementation of bar()");
    }
}

//5.Functional interfaces:	Functional interfaces are interfaces that have only one abstract method. Here's an example of how you can use a functional interface with a lambda expression to define behavior:
 
 @FunctionalInterface
  interface MyFunction<T, R> {
     R apply(T t);
 }

 

