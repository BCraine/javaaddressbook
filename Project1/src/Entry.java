
public class Entry {
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	public boolean favorite;
	

	public Entry(String firstName, String lastName, String address, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getfirstName() {
		return this.firstName;
	}
	public String getlastName() {
		return this.lastName;
	}
	public String getaddress() {
		return this.address;
	}
	public String getphoneNumber() {
		return this.phoneNumber;
	}
	
	
		
	

	public String toString() {
		return new String("Name: " + this.firstName + this.lastName + "\nAddress: " + this.address + "\nPhone #: " + this.phoneNumber + "\n");
	}
}
