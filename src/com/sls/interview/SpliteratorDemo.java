package com.sls.interview;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
public static void main(String[] args) {
	List<String> list =Arrays.asList("1","2","3");
	
	Spliterator i=list.spliterator();
	i.forEachRemaining((n)->System.out.println(n));
	
	
	
}
}
