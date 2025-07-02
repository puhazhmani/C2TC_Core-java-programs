package day8.abstraction;

public class Samsung implements phone{

	@Override
	public void call() {
		System.out.println("call using samsung");
	}

	@Override
	public void message() {
		System.out.println("message using samsung");
		
	}

}
