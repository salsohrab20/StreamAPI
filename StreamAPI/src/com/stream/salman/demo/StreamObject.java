package com.stream.salman.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//create object of Stream
public class StreamObject {

	public static void main(String[] args) {
	
		 //1-blank stream
		 
		Stream<Object> emptyStream=Stream.empty();
		emptyStream.forEach(e->{
			System.out.println(e);
		});
		
		
		//2-array,object,collection
		String name[] = {"Salman","Sohrab","Ansari"};
		Stream<String> stream2 = Stream.of(name);
		stream2.forEach(e->{
			System.out.println(e);
		});
		
		
		//3 using builder
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4 using Array
		IntStream stream3 = Arrays.stream(new int[] {2,3,4,56});
		stream3.forEach(e->{
			System.out.println(e);
		});
		
		//5 in collection
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			list1.add(i);
		}
		Stream<Integer> stream4 = list1.stream();
		stream4.forEach(e->{
			System.out.println(e);
		});
	}

}
