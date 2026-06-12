package com.gqt.javacodesfilehandling;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class StrExample2 {
public static void main(String[]args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of elements to be added: ");
	int n = sc.nextInt();
	for(int i = 0;i < n;i++) {
		al.add(sc.nextInt());
	}
	System.out.println("The elements are : "+al);
	System.out.println("----------------");
	
	List<Integer> list = al.stream().filter(l -> l%2==0).collect(Collectors.toList());
	System.out.println(list);
}
}
