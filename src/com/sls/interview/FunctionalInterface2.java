 package com.sls.interview;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface2 {
	/*
	 * public int add(int a, int b) { return a+b; }
	 */
	 
	
	public static void main(String args[])
{
		
	//    
	    Function<Integer, Double> functionName=(inputParameterIntegerType)->{
	    	return inputParameterIntegerType*2.0; // returning output Parameter Double Type
	    };

	    
	    System.out.println(" anonymouse function interface-> "+ functionName.apply(10));
	    
	    // Now treble the output of half function
	    functionName = functionName.andThen(a -> 3 * a);
	    System.out.println(" anonymouse function interface after andThen -> "+ functionName.apply(10));
	    
    int a = 5;

    // lambda expression to define the calculate method
    Square s = (int x) -> x * x;

    // parameter passed and return type must be
    // same as defined in the prototype
    int ans = s.cal(a);
    System.out.println(ans);
    
//    Consumer
    System.out.println("*** Consumer interface");
    Consumer<Integer> consumer=(value)->{System.out.println(value);};
    
   
    /*public consumer(int value) {
    	
    }*/
    consumer.accept(a);
    BiConsumer<Integer, String> bicosBiConsumer=(v1,v2)->System.out.println(v1+","+v2);
    bicosBiConsumer.accept(2, "Hello");
    
    
//  predicate
  System.out.println("*** Predicate interface");
  
  Predicate<Integer> predicate=(v)->v>2;
  System.out.println(predicate.test(4));
  BiPredicate<Integer, Integer> com=(v1,v2)->v1>v2;
  System.out.println(com.test(4,2));
  
  
//Function
System.out.println("*** Function interface");    
    BiFunction<Integer, Integer, Integer> biF=(v1,v2)->{return v1+v2;};
    
    System.out.println(biF.apply(1, 2));
    
//   Supplier
    System.out.println("*** Supplier interface");    
    Supplier<Integer> supp=()->{return 5;};
    System.out.println(supp.get());
    
    
    
}}
