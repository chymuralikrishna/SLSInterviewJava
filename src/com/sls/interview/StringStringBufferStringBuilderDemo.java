package com.sls.interview;

public class StringStringBufferStringBuilderDemo {
	
	public static void concatString(String s) {
		s=s+"ch";
	}
	public static void concatStringBuffer(StringBuffer s) {
		s.append("ch");
	}
	public static void concatStringBuilder(StringBuilder s) {
		s.append("ch");
	}
public static void main(String[] args) {
	String s="mk";
	String s1=s.concat("ch");
	System.out.println(s);
	System.out.println(s1);
	StringBuffer sBuff=new StringBuffer("mk");
	StringBuilder sBuild= new StringBuilder("mk");
	concatString(s);// it is immutable
	concatStringBuffer(sBuff);// it is mutable and thread safe
	concatStringBuilder(sBuild);//it is mutable but not thread safe
	System.out.println(s);
	System.out.println(sBuff);
	System.out.println(sBuff);
}
}

