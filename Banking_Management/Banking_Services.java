package Banking_Management;

import java.util.*;

public class Banking_Services {
	
	ArrayList<Bank_Account> al = new ArrayList<Bank_Account>();
	Scanner sc = new Scanner(System.in);
	
	void view()
	{
		System.out.println(al);
	}
	
	void Account_Creation()
	{
		System.out.println("Enter id, name to create new Bank Account");
		int id = sc.nextInt();
		String name = sc.next();
		System.out.println("Enter amount to deposit in the Account");
		double amount = sc.nextDouble();
		al.add(new Bank_Account(id,name,amount));
		
	}
	void Account_Deletion()
	{
		System.out.println("Enter accountId to delete Bank Account");
		int did = sc.nextInt();
		for(Bank_Account x:al)
		{
			if(x.acc_id==did)
			{
	
				al.remove(al.indexOf(x));
				System.out.println("Account Deleted Successfully");
				break;
				
			}
			else
			{
				System.out.println("Invalid AccountId");
			}
		}
		
	}
	void Account_Search()
	{
		System.out.println("Enter accountId to check Bank Account");
		int did = sc.nextInt();
		for(Bank_Account x:al)
		{
			if(x.acc_id==did)
			{
				
				System.out.println("Account found Successfully"+"\n"+x);
				break;
				
			}
			else
			{
				System.out.println("Invalid AccountId");
			}
		}
	}
	void Balance_Enquiry()
	{
		System.out.println("Enter accountId to check Bank Account Balance");
		int did = sc.nextInt();
		for(Bank_Account x:al)
		{
			if(x.acc_id==did)
			{
				
				System.out.println("Account Balance found Successfully"+"\n"+x.amount);
				break;
				
			}
			else
			{
				System.out.println("Invalid AccountId");
			}
		}
	}
	void Amount_Deposit()
	{
		System.out.println("Enter accountId to Deposit Amount");
		int did = sc.nextInt();
		
		for(Bank_Account x:al)
		{
			if(x.acc_id==did)
			{
				System.out.println("Account found Successfully, Enter Amount  to Deposit");
				int ua = sc.nextInt();
				x.amount += ua;
				System.out.println("Amount Deposited Successfully"+"\n"+x.amount);
				break;
				
			}
			else
			{
				System.out.println("Invalid AccountId");
			}
		}
	}
	void Amount_Withdrawl()
	{
		System.out.println("Enter accountId to Withdrawl Amount");
		int did = sc.nextInt();
		
		for(Bank_Account x:al)
		{
			if(x.acc_id==did)
			{
				
				System.out.println("Account found Successfully, Enter Amount to Withdrawl");
				int ua = sc.nextInt();
				if(ua<=x.amount) 
				{
				x.amount -= ua;
				System.out.println("Amount Withdrawl Successfully"+"\n"+"Updated Balance"+" "+x.amount);
				break;
				}
				else
				{
					System.out.println("Insufficient Funds");
				}
				
			}
			else
			{
				System.out.println("Invalid AccountId");
			}
		}
	}
	
	
	
}
