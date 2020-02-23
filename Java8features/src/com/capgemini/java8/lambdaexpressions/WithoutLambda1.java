package com.capgemini.java8.lambdaexpressions;
interface Product{
	public void newProducts();
}
public class WithoutLambda1 {

	public static void main(String[] args) {
		int pno=10;
		Product d=new Product() {
			public void newProducts()
			{
				System.out.println("new product :"+pno);
			}
		};
		d.newProducts();
	}

}
