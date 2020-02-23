package com.capgemini.corejava.final1;
 class Myclass
{
	 public void display()
	{
		System.out.println("My class :");
	}
}
public class FinalDemo2 extends Myclass{
	final String country="India";
	public void  display()
	{//country="welcome";
		System.out.println("Country Name :"+country);
	}
	

	public static void main(String[] args) {
		FinalDemo2 fd1=new FinalDemo2();
		fd1.display();

	}

}
 