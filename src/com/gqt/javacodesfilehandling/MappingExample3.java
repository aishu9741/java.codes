package com.gqt.javacodesfilehandling;

import java.util.ArrayList;

public class MappingExample3 {
public static void main(String[]args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohit");
	al.add("virat");
	al.add("bhumrah");
	System.out.println("--------------------");
	ArrayList<String> res = new ArrayList<String>();
	for(int i = 0;i < al.size();i++) {
		res.add(al.get(i).toUpperCase());
	}
	System.out.println(res);
}
}
