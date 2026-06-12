//processing by count method
package com.gqt.javacodesfilehandling;

import java.util.ArrayList;

public class Example6 {
public static void main(String[]args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohit");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
	System.out.println("-----------------");
	long count = al.stream().filter(s->s.length()==5).count();
	System.out.println(count);
}
}
