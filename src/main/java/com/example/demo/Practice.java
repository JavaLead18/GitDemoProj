package com.example.demo;

public class Practice implements Runnable{

	public Practice(String string) {
		System.out.println("Inside the constructor of the custom thread class");
	}

	@Override
	public void run() {
		System.out.println("In run method of the custom thread class");
	}
	
	public static void main(String[] args) {
		
 		Practice p1=new Practice("P1");
	    Thread th=new Thread(p1);
	    th.start();
	}
}
