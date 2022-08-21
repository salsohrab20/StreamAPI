package com.stream.salman.demo;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			list1.add(i);
		}
		System.out.println(list1);
		
		getEvenandGt10(list1);  //1)create a list and filter even number
		
	}
	
	static void getEvenandGt10(List<Integer> list1) {
		//Arrays.asList(arg0)  -- > creates immutable list
		
				//without stream(boiler-plate)
				List<Integer> listEven = new ArrayList<Integer>();
				for(Integer i : list1)
				{
					if(i%2==0)
					{
						listEven.add(i);
					}
				}
				System.out.println(listEven);
				
				
				//with stream
				List<Integer> evenStream = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
				System.out.println(evenStream);
				
				//value g than 10
				List<Integer> valuegth10 = list1.stream().filter(i->i>10).collect(Collectors.toList());
			    System.out.println(valuegth10);
	}

}
