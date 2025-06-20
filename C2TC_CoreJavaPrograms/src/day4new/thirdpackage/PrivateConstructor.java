package day4new.thirdpackage;

public class PrivateConstructor {

	public static void main(String[] args) {
				Myclass m=Myclass.getObject();
				m.setId(10);
				
				Myclass m1=Myclass.getObject();
				
				System.out.println(m);
				System.out.println(m1);
				
			}
	}


