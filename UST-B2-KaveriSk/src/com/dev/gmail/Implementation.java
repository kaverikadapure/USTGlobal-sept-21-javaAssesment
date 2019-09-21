package com.dev.gmail;

import java.util.HashMap;
import java.util.Scanner;

public class Implementation {

	public static void main(String[] args) {

		HashMap <Integer,Account> h = new HashMap <Integer,Account>();
		HashMap <Integer,Inbox> h1 = new HashMap <Integer,Inbox>();

		Account a = new  Account();
		a.setUser_Id(1);
		a.setUser_Name("Kaveri");
		a.setEmail("kaveri@gmail.com");
		a.setPassword("ka123");

		Account a1 = new  Account();
		a1.setUser_Id(2);
		a1.setUser_Name("Kajal");
		a1.setEmail("kajal@gmail.com");
		a1.setPassword("ka111");

		Account a2 = new  Account();
		a2.setUser_Id(3);
		a2.setUser_Name("Ravi");
		a2.setEmail("ravi@gmail.com");
		a2.setPassword("ravi34");

		Inbox i = new Inbox();
		i.setMeassage_Id(1);
		i.setMessage("hello");
		i.setUser_Id(1);

		Inbox i1 = new Inbox();
		i1.setMeassage_Id(2);
		i1.setMessage("hi");
		i1.setUser_Id(2);

		Inbox i2 = new Inbox();
		i2.setMeassage_Id(3);
		i2.setMessage("hi!!");
		i2.setUser_Id(3);

		h1.put(1,i);
		h1.put(2,i1);
		h1.put(3,i2);

		System.out.println("Press 1 to login or 2 to register");

		Scanner n = new  Scanner(System.in);
		int id = n.nextInt();
		if(id==1) {
			login();	
		}
		else if(id==2)
		{
			register();
		}


	}

	public static void login() {
		System.out.println("enter the email");
		Scanner email = new Scanner(System.in);
		String mail=email.next();
		System.out.println("enter the password");
		Scanner pw = new Scanner(System.in);
		String pwd=pw.next();	

		System.out.println("Enter A to compose or B to show inbox");
		Scanner in = new Scanner(System.in);
		String input= in.next();

		switch(input) {
		case "A" :compose();
		break;
		case "B" : inbox();
		break;
		}

	}

	public static void register() {
		System.out.println("enter the email");
		Scanner email = new Scanner(System.in);
		String mail=email.next();
		System.out.println("enter the password");
		Scanner pw = new Scanner(System.in);
		String pwd=pw.next();
		System.out.println("Account created successfully");
	}

	public static void compose() {
		System.out.println("enter the Toemail");
		Scanner email = new Scanner(System.in);
		String mail=email.next();
		System.out.println("Type the mesage");
		Scanner m = new Scanner(System.in);
		String msg=m.next();
	}

	private static void inbox() {


	}



}
