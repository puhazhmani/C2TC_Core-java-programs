package day5;

public class Person {
	private int id;
	private String name;
	private String city;
	public Person() {
		this.id=10;
		this.name="jk";
		this.city="ch";
	}
	public Person(int id,String name,String city) {
		this.name=name;
		this.city=city;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public static int age=1; 

}
