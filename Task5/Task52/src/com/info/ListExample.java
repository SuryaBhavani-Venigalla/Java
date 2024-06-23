package com.info;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
	
	
       public static void main(String[] args) {
    	   List<String> list=Arrays.asList("abc", "", "bc","efg","abcd","","jkl");
    	   List<String> nonEmptyList=list.stream().filter(x -> !(x.isEmpty())).collect(Collectors.toList());
    	   for(String x:nonEmptyList) {
    		   System.out.println(x);
    	   }
       }
}
