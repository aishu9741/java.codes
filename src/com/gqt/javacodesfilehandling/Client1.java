package com.gqt.javacodesfilehandling;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
public static void main(String[]args) throws Exception{
	Socket csoc = new Socket("192.168.110.246",4000);
	OutputStream os = csoc.getOutputStream();
	DataOutputStream dos = new DataOutputStream(os);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the message from Client: ");
	String message = sc.nextLine();
	dos.writeUTF(message);
}
}
