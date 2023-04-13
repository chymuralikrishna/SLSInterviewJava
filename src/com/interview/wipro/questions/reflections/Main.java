package com.interview.wipro.questions.reflections;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
Test obj=new Test();
Class cls=obj.getClass();

System.out.println("getName()  is : "+cls.getName());
System.out.println("getConstructor() is : "+cls.getConstructor().getName());

for(Method m:cls.getMethods()) {
	System.out.println(m.getName());
}

Method method2=cls.getMethod("method2", int.class);
method2.invoke(obj, 19);


Method method3=cls.getDeclaredMethod("method3");
method3.setAccessible(true);
method3.invoke(obj);


}	

}
