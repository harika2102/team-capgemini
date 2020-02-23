package com.capgemini.java8.lambdaexpressions;
interface Product1{
	public void newProducts();
}
public class withlambda1 {

	public static void main(String[] args) {
		int pno=10;
		Product1 d2= () ->
				{
				System.out.println("new product :"+pno);
			    };
		d2.newProducts();			
	}
}
