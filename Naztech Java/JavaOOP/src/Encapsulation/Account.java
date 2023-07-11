package Encapsulation;

public class Account {
	private int account_no;
	private String name,email;
	private float amount;
	
//	Accounts
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no=account_no;
	}

//	name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
//	email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
//	Amount
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}
	
}
