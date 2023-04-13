package com.sls.interview;
import java.lang.reflect.Method;

public class HashCodeExample {
	public void getSomeMethod() {}
public static void main(String[] args) throws Exception {
	System.out.println();
	/*
	 * Class c=HashCodeExample.class; Method
	 * method=c.getDeclaredMethod("getSomeMethod", null); int
	 * hashCode=method.hashCode();
	 * System.out.println("hashCode of method"+method.getName()+" is "+hashCode);
	 * String x="";
	 */
	
	
	
//	
	
	
	      String a = new String("100");
	      String b = "100";
	      System.out.println(a);
	      System.out.println(b);
	      if(a.equals(b))
	      {
	        System.out.println("Equal variables:");
	        System.out.println(a.hashCode() + "\n" + b.hashCode());
	      }
	      
	      String c = "100";
	      String d = "500";
	 
	      if(!c.equals(d))
	      {
	          System.out.println("\nUn-equal variables:");
	          System.out.println(c.hashCode() + "\n" + d.hashCode());
	      }
	      String Str = new String("We are learning hashCode in Java");
	      System.out.println("Hashcode for Str :" + Str.hashCode() );
	      
	      
	      System.out.println(Integer.hashCode(2342342));
	   }
	
}
