package com.sls.interview;

public class DefaultMethodExampleImpl  implements DefaultMethodExample{
	/*
	 * public void show(int x) { System.out.println(x); //
	 * DefaultMethodExample.super.show(4); }
	 */
public static void main(String[] args) {
	
	DefaultMethodExampleImpl d=new DefaultMethodExampleImpl();
	d.show(0);
}
@Override
public void test() {
	// TODO Auto-generated method stub
	
}
}
