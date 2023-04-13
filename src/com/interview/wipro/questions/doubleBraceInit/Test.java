package com.interview.wipro.questions.doubleBraceInit;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map map=new HashMap() {{put("k1","v1");put("k3","v1");put("k2","v1");}};
		map.forEach((key,value)->System.out.println(key+":"+value));
	}

}
