package day5.multilevelinheritance;
import java.util.Date;

public class Employee extends Person {

		private String deptName;
		private double baseSalary;
		
		public Employee(String name, long contactNo, Date dateOfBirth, String deptName2, double baseSalary2) {
			super(name, contactNo, dateOfBirth);
			this.deptName = deptName;
			this.baseSalary = baseSalary;
		}
		

		public Employee(String name, int contactNo, int i, String deptName2, int baseSalary2) {
			// TODO Auto-generated constructor stub
		}


		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(double baseSalary) {
			this.baseSalary = baseSalary;
		}

		@Override
		public String toString() {
			return "Employee ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
		}

		
	}


