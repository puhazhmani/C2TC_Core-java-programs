package day8.abstraction;

public class Executor {

	public static void main(String[] args) {
			
			phone p1 = PhoneFactory.createPhone("Samsung"); 
			p1.call();
			p1.message();
			
			p1 = PhoneFactory.createPhone("Jio"); 
			p1.call();
			p1.message();
			
		}

	}


