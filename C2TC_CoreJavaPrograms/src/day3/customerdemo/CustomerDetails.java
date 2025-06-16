package day3.customerdemo;

public class CustomerDetails {
	private int customerid;
	private String name;
	private String city;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
		return "CustomerDetails [customerid=" + customerid + ", name=" + name + ", city=" + city + "]";
	}
	

}
