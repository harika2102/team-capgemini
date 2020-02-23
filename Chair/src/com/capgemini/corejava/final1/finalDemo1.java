package com.capgemini.corejava.final1;

public class finalDemo1 {
	  final String country="India";
	public void display()
	{// country="wel";
		System.out.println("Country name :"+country);
	}

	public static void main(String[] args) {
		finalDemo1 fd1= new finalDemo1();
		fd1.display();
	}

}
