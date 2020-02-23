package com.capgemini.java8.lambdaexpressions;
interface Product2{
	public String display(String name);
	
}
public class LambdaSingleParameters {
	public static void main(String[] args) {
		Product2 p1=(name)->{
			return"Hello,"+name;
		};
		System.out.println(p1.display("Dell laptop"));
		Product2 p2=(name)->{
			return "hello,"+name;
		};
		System.out.println(p2.display("Hp laptop"));
	}

}
