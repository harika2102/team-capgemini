package com.java8.streams;
//The equivalent example in Java 8, stream.filter() to filter a List,
//and collect() to convert a stream into a List.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamEx1 {
	public static void main(String[] args) {
	  List<String> lines = Arrays.asList("JAVA", "Technologies", "Ram");

 List<String> result = lines.stream()                
		                .filter(my -> !"Ram".equals(my))     
		                .collect(Collectors.toList());              
      //collect the output and convert streams to a List
		        result.forEach(System.out::println);               
		       

		    }	 }


