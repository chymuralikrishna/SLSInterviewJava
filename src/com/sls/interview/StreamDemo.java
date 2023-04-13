package com.sls.interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
public static void main(String[] args) {
	
	List<String> list=Arrays.asList("This","is","java","Stream","example");
	
	Stream<String> stream=list.stream();
	
	System.out.println("List: " +list);
//	System.out.println("Stream: " +Arrays.toString(stream.toArray()));

	List<String> listFromStream=stream.collect(Collectors.toList());
	System.out.println(listFromStream);
	System.out.println(list);
	
}
}
