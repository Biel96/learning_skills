package entities_2;

public class Agenda {

	private String name;
	private String number;
	private String email;

	public Agenda() {

	}

	public Agenda(String name, String number, String email) {
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public Agenda(String name, String number) {
		this.name = name;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Name: " 
				+ name 
				+ "\nNumber: " 
				+ number 
				+ "\nE-mail: " 
				+ email;
	}

}
