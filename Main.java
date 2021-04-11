package AddressBookSystem;

public class Main {
	public static void main(String[] args) {
		System.out.println("Create your first contact.");
		ContactDetail contactBook = new ContactDetail("Nishi","Gautam","Mayur Vistar","Lucknow","UP",2260,"9553470596","nishi@gmail.com");
		contactBook.printAddressbook();
	}
}
