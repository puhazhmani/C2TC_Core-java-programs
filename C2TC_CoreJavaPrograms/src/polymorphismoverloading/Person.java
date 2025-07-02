package polymorphismoverloading;

public class Person {
	private int id;
	private String name;
	private String city;
	public Person() {
		this.id=30;
		this.name="kk";
		this.city="ch";
	}
	public Person(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
