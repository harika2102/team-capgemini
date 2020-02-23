package com.capgemini.java8.lambdaexpressions;

public class Example2 {

	public static void main(String[] args) {
		new Thread(
				() -> {
					System.out.println("using lambda Expression");
	                  }
				).start();
	}

}
