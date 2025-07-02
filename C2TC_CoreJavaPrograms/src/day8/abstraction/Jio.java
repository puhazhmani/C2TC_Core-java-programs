package day8.abstraction;

public class Jio implements phone{
	@Override
	public void call() {
		System.out.println("call using jio");
	}

	@Override
	public void message() {
		System.out.println("message use jio");
		
	}

	
}
