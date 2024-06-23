package com.info;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterExample {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Amith","Anusha","Amar","Surya","Siri","Hassi","Laxmi","Akshara","Devansh","Suresh");
		List<String> namesWithA=names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        for(String x:namesWithA) {
        	System.out.println(x);
        }
	}

}
