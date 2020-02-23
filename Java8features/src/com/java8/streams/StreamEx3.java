package com.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;
public class StreamEx3 {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList); //prints [1, 2, 3, 4]

		intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
		Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
		System.out.println(intMap);

	}

}
