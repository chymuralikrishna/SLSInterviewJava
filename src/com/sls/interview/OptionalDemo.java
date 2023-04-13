package com.sls.interview;
import java.util.Optional;

public class OptionalDemo {
public static void main(String[] args) {
	String[] words=new String[10];
	Optional<String> list=Optional.ofNullable(words[5]);
	
System.out.println(list.isPresent()?list.get():list.orElse("Not available"));
}
}
