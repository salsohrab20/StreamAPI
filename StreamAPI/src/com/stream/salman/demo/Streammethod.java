package com.stream.salman.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streammethod {

	public static void main(String args[]) {
		
		//filter-> predicate (takes boolean valued function and filters the element on the basis of T/F)
		                     // e->e>10 if true moves forward
		
		//map(Function) -> performs operation on each element after doing operation.function return value
		
		 //forEach() -> takes in consumer and prints the value related to the consumer
		
		//sorted -> to sort number using sorted
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("salman");
		list1.add("sohrab");
		list1.add("ansari");
		
		list1.stream().forEach(System.out::println);
		checkstart(list1);
		
		List<Integer> list3 = new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			list3.add(i);
		}
		list3.add(34);
		System.out.println(list3);
		
		useOfMap(list3);
		
		
		
		
	}
	static void checkstart(List<String> list1)
	{
		List<String> valCheck=list1.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
		System.out.println(valCheck);
	}
	
	static void useOfMap(List<Integer> list3)
	{
	     List<Integer> listMap=list3.stream().map(i->i*i).collect(Collectors.toList());
	     System.out.println(listMap);
	     
	     listMap.stream().sorted().forEach(System.out::println);
	     
	     Integer intmini= mininumber(listMap);
	     Integer intmaxi=maxinumber(listMap);
	     System.out.println(intmini+" "+intmaxi);
	}
	static Integer mininumber(List<Integer> l)
	{
		Integer result=l.stream().min((x,y)->x.compareTo(y)).get();
		return result;
	}
	static Integer maxinumber(List<Integer> l)
	{
		Integer result=l.stream().max((x,y)->x.compareTo(y)).get();
		return result;
	}
}
