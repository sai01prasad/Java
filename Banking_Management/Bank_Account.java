package Banking_Management;

public class Bank_Account 
{
	
	int acc_id;
	String name;
	double amount;
	public Bank_Account(int acc_id, String name, double amount) {
		super();
		this.acc_id = acc_id;
		this.name = name;
		this.amount = amount;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return  acc_id + " " + name + " " + amount; 
	}
	
	
	
}
