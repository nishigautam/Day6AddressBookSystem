package AddressBookSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public ArrayList<ContactDetail> contactArray;
	public Map<String,ContactDetail> contactMap;
	public Main() {
		contactArray = new ArrayList<>();
		contactMap = new HashMap<>();
	}
	
	public void addNewContact(String firstname, String lastname, 
			String address, String city, String state, int pincode, 
			long phonenumber, String emailid) {
		ContactDetail con = new ContactDetail(firstname, lastname, address, city,
				state, pincode, phonenumber, emailid);
		contactArray.add(con);
		contactMap.put(firstname, con);
	}
	
	public void editContact() {
		System.out.println("Enter the first name whose contact details is to be edited: ");
		String fn = sc.nextLine();
		ContactDetail obj = contactMap.get(fn);
		System.out.println();
		System.out.println("Enter the Address :");
		String add=sc.nextLine();
		obj.setAddress(add);
		System.out.println("Enter the City :");
		String citi = sc.nextLine();
		obj.setCity(citi);
		System.out.println("Enter State :");
		String stat = sc.nextLine();
		obj.setState(stat);
		System.out.println("Enter Pincode :");
		int pin = sc.nextInt();
		obj.setPincode(pin);
		System.out.println("Enter the PhoneNumber :");
		long num = sc.nextInt();
		obj.setPhoneNumber(num);
		System.out.println("Enter the EmailID :");
		String email = sc.nextLine();
		obj.setEmailId(email);
		System.out.println();
	}
	
	public void printContact() {
		System.out.println(contactArray);
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name :");
		String firstname = s.nextLine();
		System.out.println("Enter Last Name :");
		String lastname = s.nextLine();
		System.out.println("Enter Address :");
		String address = s.nextLine();
		System.out.println("City:");
		String city = s.nextLine();
		System.out.println("State :");
		String state = s.nextLine();
		System.out.println("Pincode :");
		int pincode = s.nextInt();
		System.out.println("Phone Number :");
		long phonenumber = s.nextLong();
		System.out.println("Email Id :");
		String emailid = s.nextLine();
		Main ContactOne = new Main();
		ContactOne.addNewContact(firstname, lastname, address, city,
				state, pincode, phonenumber, emailid);
	ContactOne.printContact();
	ContactOne.editContact();
	System.out.println("After ContactBook gets edited :");
	ContactOne.printContact();
	}
}
