package day5;

public class Trainer extends Person {
		private String designation;
		private String location;
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		Trainer(String designation,String location,int id,String name,String city){
			super(id,name,city);
			this.designation=designation;
			this.location=location;
		}
		@Override
		public String toString() {
			return "Trainer [designation=" + designation + ", location=" + location + "id = "+getId()+"name="+getName()+"city= "+getCity()+"]";
		}

	}

