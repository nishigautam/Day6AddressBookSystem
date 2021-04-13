package AddressBookSystem;

public class ContactDetail {
	public String firstname;
	public String lastname;
	public String address;
	public String state;
	public String city;
	public int pincode;
	public long phonenumber;
	public String emailid;
	
	public ContactDetail(String firstname, String lastname, String address, 
			String state, String city, int pincode, long phonenumber, String emailid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String setAddress(String address) {
		return this.address = address;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public long getPhoneNumber() {
		return phonenumber; 
	}
	
	public void setPhoneNumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getEmailId() {
		return emailid;
	}
	
	public String setEmailId(String emailid) {
		return this.emailid = emailid;
	}
	
	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address +
				", city=" + city + ", state=" + state + ", pincode=" + pincode + ", phonenumber=" + phonenumber +
				", emailId=" + emailid + "]";
	}
}