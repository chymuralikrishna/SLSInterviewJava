package com.sls.interview;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {
public static void main(String[] args) {
	PipedInputStream pis=new PipedInputStream();
	PipedOutputStream pos=new PipedOutputStream();
	try {
		pis.connect(pos);
		pos.write(64);
		pos.write(65);
		System.out.println(pis.read());
		pos.flush();
		System.out.println(pis.read());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

