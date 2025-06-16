package day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args)
	{
	Scanner jk = new Scanner(System.in);
	System.out.println("enter your name:");
	String name=jk.next();
	System.out.println("enter age:");
	int age=jk.nextInt();
	System.out.println("enter salary:");
	double salary=jk.nextDouble();
	
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("salary:"+salary);
	jk.close();
	
	}

}
