package com.gqt.javacodesfilehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Server2 {
public static void main(String[]args) throws Exception{
	ServerSocket listener = new ServerSocket(4000);
	Socket ssoc = listener.accept();
	InputStream is = ssoc.getInputStream();
	DataOutputStream dos = new DataOutputStream(os);
	Scanner sc = new Scanner(System.in);
	for(int i = 1;i<5;i++) {
		String message = dis.readUTF();
		System.outprintln(message);
		System.out.println("---------------------");
		System.out.println("Enter the response");
		System.out.println("Enter the response");
	}
	
			}
}
