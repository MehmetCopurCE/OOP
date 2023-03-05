
public class Address {

	private String streetAddress, city, state;
	private long zipCode;
	
	public Address(String street, String town, String st, long zip) { //Constructor
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	
	public String toString() {
		String Address;
		
		Address = streetAddress + "\n" + city + " " + state;
		Address += city + " " + state + " " + zipCode;
		
		return Address;
				
	}
}
