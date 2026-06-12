package com.gqt.javacodesfilehandling;
import java.util.ArrayList;

public class Example11 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohit");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
    System.out.print("--------------");
    String min = al.stream().min((s1,s2) ->s1.compareTo(s2)).get();
    System.out.println("The min valued string is = +min");
    System.out.println("------------");
    String max = al.stream().max((s1,s2)-> s1.compareTo(s2)).get();
    System.out.println("The max valued string is = " +max);
}
}
