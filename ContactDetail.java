package AddressBookSystem;

public class ContactDetail {
	public String firstname;
	public String lastname;
	public String address;
	public String state;
	public String city;
	public int pincode;
	public String phonenumber;
	public String emailid;
	
	public ContactDetail(String firstname, String lastname, String address, 
			String state, String city, int pincode, String phonenumber, String emailid) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
	}

	public void printAddressbook() {
		System.out.println("First Name:" + this.firstname);
		System.out.println("Last Name:" + this.lastname);
		System.out.println("Address:" + this.address);
		System.out.println("State:" + this.state);
		System.out.println("City:" + this.city);
		System.out.println("Pincode:" + this.pincode);
		System.out.println("Phone Number:" + this.phonenumber);
		System.out.println("Email:" + this.emailid);
	}
}
