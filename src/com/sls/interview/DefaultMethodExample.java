package com.sls.interview;

public interface DefaultMethodExample {

	default void show(int x) {
		System.out.println(x);
	}
	public void  test() ;
}
