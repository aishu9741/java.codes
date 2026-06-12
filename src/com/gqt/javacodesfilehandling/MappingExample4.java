package com.gqt.javacodesfilehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample4 {
	public static void main(String[]args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohit");
		al.add("virat");
		al.add("bhumrah");
		System.out.println("--------------------");
		List<String> res = al.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(res);
	}
}
