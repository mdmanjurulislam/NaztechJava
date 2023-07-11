package Encapsulation;

public class Test {
	public static void main(String[] args) {
		Account accounts= new Account();
		
		accounts.setName("Manjurul Islma");
		System.out.println("Name : "+accounts.getName());
		
		accounts.setAccount_no(100215);
		System.out.println("Account Number : "+accounts.getAccount_no());
		
		accounts.setEmail("sohag810032@gmail.com");
		System.out.println("Email : "+accounts.getEmail());
		
		accounts.setAmount(50000);
		System.out.println("Total Amounts : "+accounts.getAmount());
	}

}
