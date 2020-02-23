package com.capgemini.corejava.static1;

public class StaticDemo {
	static String countryName="India";
	int t=100;
	public void display() {
	 System.out.println("display method :"+t);
	}
 static public void myPrint()
 {
	 System.out.println("This is myPrint method ");
 }
	public static void main(String[] args) {
		StaticDemo.myPrint();
		System.out.println("country name:"+StaticDemo.countryName);
		StaticDemo sd=new StaticDemo();
		sd.display();
 
	}

}
