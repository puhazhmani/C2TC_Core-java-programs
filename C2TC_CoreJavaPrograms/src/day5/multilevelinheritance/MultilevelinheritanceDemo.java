package day5.multilevelinheritance;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MultilevelinheritanceDemo {
		
			public static void main(String[] args) {

				Person p1 = new Person("Atharv", 7878767676L, new Date(2000, 12, 2));
				System.out.println(p1);

				p1 = new LeveloneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
						"Signing Authority");
				System.out.println(p1);
			}
	}


