package day4;

public class Myclss {
private static Myclss obj=new Myclss();
public static Myclss getobj() {
	return obj;	
}
	public static Myclss getObj() {
	return obj;
}
	private int id;
	private String name;
private	Myclss(){
		super();
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
	@Override
	public String toString() {
		return "Myclss [id=" + id + ", name=" + name + "]";
	}
	

}

