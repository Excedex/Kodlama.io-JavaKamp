package youtubeEgitim;

public class Program {

	public static void main(String[] args) {

		CreditManager creditManager=new CreditManager();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer=new Customer();
		Customer customer2=new Customer(1,"Ali", "Tok", "Turk");
		
		
		customer.setId(2);
		customer.setName("Ahmet");
		customer.setLastname("Tok");
		customer.setNationalIdentity("Türk");
		
		System.out.println(customer.getName());
		System.out.println(customer2.getName());
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.Save(3, "veli", "yýlmaz","Türk");
		
		
	}
	
}
