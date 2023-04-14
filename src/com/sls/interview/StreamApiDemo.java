package com.sls.interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	
	public static void main(String[] args) {
		
	
	
	/*
	 * What is Java Stream API and how does it work? Java Stream API is a set of
	 * classes and interfaces that provide functional-style operations on streams of
	 * elements. Streams can be created from collections, arrays, or I/O channels,
	 * and can be processed in parallel or sequentially. Here is an example of how
	 * to create a stream and perform some basic operations on it:
	 */
			
			List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

			// create a stream from the list of names
			Stream<String> nameStream = names.stream();

			// filter out names that start with "A"
			nameStream = nameStream.filter(name -> !name.startsWith("A"));

			// convert remaining names to uppercase
			nameStream = nameStream.map(String::toUpperCase);

			// print the resulting names
			nameStream.forEach(System.out::println);
			
			
			System.out.println("------------MK--------------");
			names.stream().filter(x->x.contains("l")).forEach(System.out::println);
			names.stream().map(String::toUpperCase).forEach(System.out::println);
			System.out.println("------------MK--------------");

			/*What are the main benefits of using Java Stream API?
			The main benefits of using Java Stream API are that it allows us to write concise and readable code, it supports parallel processing of data, and it can improve performance by reducing the amount of code and data that needs to be processed. Here is an example of how to use Java Stream API to find the average age of a list of people:
*/

			List<Person> people = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35),
			    new Person("Dave", 40),
			    new Person("Eve", 45)
			);

			// calculate the average age of the people
			double averageAge = people.stream()
			    .mapToInt(Person::getAge)
			    .average()
			    .orElse(0.0);

			System.out.println("Average age: " + averageAge);
			System.out.println("------------MK--------------");
			System.out.println(people.stream().mapToInt(Person::getAge).average().orElse(0.0));		
			
			/*What is the difference between a stream and a collection?
			A collection is a data structure that holds a group of elements, while a stream is a sequence of elements that can be processed in a declarative way. Here is an example of how to use Java Stream API to count the number of distinct words in a file:
*/
			
			
			Path filePath = Paths.get("L:\\mk_workspaces\\SLSInterviewJava\\src\\com\\sls\\interview\\example.txt");
			Set<String> words = new HashSet<>();

			try (Stream<String> lines = Files.lines(filePath)) {
			    lines.flatMap(line -> Arrays.stream(line.split("\\W+")))
			         .filter(word -> !word.isEmpty())
			         .map(String::toLowerCase)
			         .forEach(words::add);
			} catch (IOException e) {
			    e.printStackTrace();
			}

			int numWords = words.size();
			System.out.println("Number of distinct words: " + numWords);
			
			
			/*What are the different types of stream operations?
			There are two types of stream operations: intermediate operations and terminal operations. 
			Intermediate operations transform the data in the stream, while terminal operations produce a result or a side effect. 
			Here is an example of how to use Java Stream API to find the longest name in a list of names:less
			
			Intermediate Operations:
			map(), filter(), distinct(),sorted(),limit(),skip()
			
			Terminal Operations:
			forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
			*/
			
			List<String> namesx = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

			// find the longest name
			Optional<String> longestName = namesx.stream()
			    .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);

			if (longestName.isPresent()) {
			    System.out.println("Longest name: " + longestName.get());
			} else {
			    System.out.println("No names found");
			}
			
			
		/*	What is the purpose of the map() operation?
			The map() operation is used to transform the data in the stream by applying a function to each element in the stream. Here is an example of how to use Java Stream API to square the numbers in a list:

			*/
			
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
			// square each number in the list
			List<Integer> squares = numbers.stream()
			.map(n -> n * n)
			.collect(Collectors.toList());

			System.out.println("Squares: " + squares);

			/*
			 * 
			 * 6. What is the purpose of the filter() operation?
			 * 
			 * The filter() operation is used to select elements from the stream that
			 * satisfy a given predicate. Here is an example of how to use Java Stream API
			 * to filter out even numbers from a list:
			 */

					List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);

					// filter out even numbers from the list
					List<Integer> odds = numbers6.stream()
					.filter(n -> n % 2 != 0)
					.collect(Collectors.toList());

					System.out.println("Odd numbers: " + odds);

					
				

				/*	7. What is the purpose of the reduce() operation?

					The reduce() operation is used to combine the elements in the stream into a single result by applying a binary operator to each element in the stream. Here is an example of how to use Java Stream API to find the product of the numbers in a list:
*/
					List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5);

					// calculate the product of the numbers in the list
					int product = numbers7.stream()
					.reduce(1, (n1, n2) -> n1 * n2);

					System.out.println("Product: " + product);

					
				

					/*8. What is the purpose of the flatMap() operation?

					The flatMap() operation is used to flatten nested collections in the stream. Here is an example of how to use Java Stream API to flatten a list of lists:
*/
					List<List<Integer>> numbers8 = Arrays.asList(
					Arrays.asList(1, 2, 3),
					Arrays.asList(4, 5,5),
					Arrays.asList(6, 7, 8)
					);

					// flatten the list of lists
					List<Integer> flattened = numbers8.stream()
					.flatMap(Collection::stream)
					.collect(Collectors.toList());

					System.out.println("Flattened list: " + flattened);

					
				

				/*	9. How can you parallelize stream processing?

					Stream processing can be parallelized by using the parallel() operation or by using the parallelStream() 
					method on the collection data source. 
					Here is an example of how to use Java Stream API to parallelize the processing of a large list:
*/
					List<Integer> numbers9 = new ArrayList<>();
					for (int i = 1; i <= 1000000; i++) {
					numbers9.add(i);
					}

					// calculate the sum of the numbers in parallel
					long startTime = System.nanoTime();
					long sum = numbers9.parallelStream()
					.mapToLong(Long::valueOf)
					.sum();
					long endTime = System.nanoTime();

					System.out.println("Sum: " + sum);
					System.out.println("Time taken: " + (endTime - startTime) / 1000000.0 + " ms");
	
	
	}
	
	
	
	
	
	
	
	/*
	 * What is Java Stream API? Java Stream API is a feature introduced in Java 8
	 * that allows us to process collections of data in a declarative way. It
	 * provides a set of operations that can be performed on the collection data
	 * source.
	 * 
	 * What are the main benefits of using Java Stream API? The main benefits of
	 * using Java Stream API are that it allows us to write concise and readable
	 * code, it supports parallel processing of data, and it can improve performance
	 * by reducing the amount of code and data that needs to be processed.
	 * 
	 * What is the difference between a stream and a collection? A collection is a
	 * data structure that holds a group of elements, while a stream is a sequence
	 * of elements that can be processed in a declarative way.
	 * 
	 * What are the different types of stream operations? There are two types of
	 * stream operations: intermediate operations and terminal operations.
	 * Intermediate operations transform the data in the stream, while terminal
	 * operations produce a result or a side effect.
	 * 
	 * What is the difference between a stateful and a stateless operation? A
	 * stateful operation is an operation that depends on the order of the elements
	 * in the stream, while a stateless operation is an operation that does not
	 * depend on the order of the elements.
	 * 
	 * What is the purpose of the map() operation? The map() operation is used to
	 * transform the data in the stream by applying a function to each element in
	 * the stream.
	 * 
	 * What is the purpose of the filter() operation? The filter() operation is used
	 * to select elements from the stream that satisfy a given predicate.
	 * 
	 * What is the purpose of the reduce() operation? The reduce() operation is used
	 * to combine the elements in the stream into a single result by applying a
	 * binary operator to each element in the stream.
	 * 
	 * What is the purpose of the flatMap() operation? The flatMap() operation is
	 * used to flatten nested collections in the stream.
	 * 
	 * How can you parallelize stream processing? Stream processing can be
	 * parallelized by using the parallel() operation or by using the
	 * parallelStream() method on the collection data source.
	 */
}
