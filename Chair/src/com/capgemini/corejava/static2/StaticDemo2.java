package com.capgemini.corejava.static2;

public class StaticDemo2 {

	static String countryName="India";
	int t=100;
	static {
		System.out.println("This is static block");
	}
	public void display()
	{  myPrint();
		System.out.println("display method .."+t);
	}
	static public void myPrint()
	{ // display();
		System.out.println("This is myPrint static method");
	}
	public static void main(String[] args) {
		System.out.println("country Name :"+StaticDemo2.countryName);
		StaticDemo2 sd=new StaticDemo2();
		sd.display();

	}

}
