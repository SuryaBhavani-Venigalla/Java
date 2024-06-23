package com.info;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class mapMethodExample {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("aBc","d","ef");
		List<String> uppercaseWords=names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		//List<String> uppercaseWords=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        for(String x:uppercaseWords){
        	System.out.println(x);
        }
		
	}

}
