package polymorphismoverloading;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println(Overloadingexample.addition(7, 7));
		System.out.println(Overloadingexample.addition(4.00f,8.00f));
		Person p1=new Person();
		System.out.println(p1);
		p1=new Person(10,"kk","mm");
		System.out.println(p1);
		p1=new Person(10,"kk");
		System.out.println(p1);
	}

}
