package com.capgemini.java8.lambdaexpressions;

import java.util.ArrayList;

public class LambdaExpressionForeachloop {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ankit");
		list.add("ravi");
		list.add("raj");
		list.add("ram");
		list.forEach(
				(t)->System.out.println(t)
				);
	}

}
