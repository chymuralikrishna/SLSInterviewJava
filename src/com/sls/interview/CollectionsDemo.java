package com.sls.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsDemo {
public static void main(String[] args) {
//		What is map and flatMap
	 List<Integer> numbers = new ArrayList<>();
	 numbers.add(3);
	 numbers.add(4);
	 numbers.add(5);
	 numbers.add(6);
	 numbers.add(7);
//	 map()
	List<Double> doubledNumbers = numbers.stream().map(x -> x * 2.0).collect(Collectors.toList());
	
	List<Integer> numbers1 = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
	List<Integer> numbers2 = numbers1.stream().map(x -> x * 2).collect(Collectors.toList());
	List<Integer> numbers3 = numbers2.stream().map(x -> x * 2).collect(Collectors.toList());
	
	List<List<Integer>> numbersAll = new ArrayList<List<Integer>>();
	numbersAll.add(numbers);
	numbersAll.add(numbers1);
	numbersAll.add(numbers2);
	numbersAll.add(numbers3);
	System.out.println(numbersAll);
//	flatMap()
	List<Integer> numbersAll2=numbersAll.stream().flatMap(v->v.stream()).collect(Collectors.toList());
	System.out.println(numbersAll2);
}
}
