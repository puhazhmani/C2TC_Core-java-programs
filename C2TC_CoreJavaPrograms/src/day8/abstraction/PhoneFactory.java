package day8.abstraction;

public class PhoneFactory {
	public static phone createPhone(String company) {
	if (company.equalsIgnoreCase("Samsung"))
		return new Samsung();
	else if (company.equalsIgnoreCase("Jio"))
		return new Jio();
	return null;
}
}

