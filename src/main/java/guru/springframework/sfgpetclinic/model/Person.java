package guru.springframework.sfgpetclinic.model;

public class Person {

	private final String FirstName;
	private final String Lastname;
	
	public Person(String firstName, String lastname) {
		super();
		FirstName = firstName;
		Lastname = lastname;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastname() {
		return Lastname;
	}
	
	
}
