package com.capgemini.java8.lambdaexpressions;

public class Example1 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
				public void run() {
				System.out.println("java program");
				}
			}).start();
		}
	}


