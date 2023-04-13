package com.interview.wipro.questions.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeSerialization {
public static void main(String[] args) throws Exception {
	
	B b1=new B(10,20);
	
	System.out.println("i="+b1.i);
	System.out.println("j="+b1.j);
	
	FileOutputStream fos=new FileOutputStream("sDs.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(b1);
	oos.close();
	fos.close();
	
	System.out.println("Object has been serialized.");
	
	FileInputStream fis=new FileInputStream("sDs.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	B b2=(B)ois.readObject();
	ois.close();
	fis.close();
	
	System.out.println("Object has been Deserialized.");
	System.out.println("i="+b2.i);
	System.out.println("j="+b2.j);
	
}
}
