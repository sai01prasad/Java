package Banking_Management;

import java.util.Scanner;

public class Banking_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banking_Services ob = new Banking_Services();
		//ob.Account_Creation();
		//ob.view();
		//ob.Account_Deletion();
		//ob.view();
		//ob.Account_Search();
		//ob.Balance_Enquiry();
		//ob.Amount_Deposit();
		//ob.Amount_Withdrawl();
		//ob.view();
		char op;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n 1 - To Create new Account \n 2 - To search Account \n 3 - To Balance Enquiry \n 4 - To Deposit Amount \n 5 - To Withdraw Amount \n 6 - To Delete Account \n 7 - To view Account Details");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: ob.Account_Creation();
				break;
		case 2: ob.Account_Search();
				break;
		case 3: ob.Balance_Enquiry();
				break;
		case 4: ob.Amount_Deposit();
				break;
		case 5: ob.Amount_Withdrawl();
				break;
		case 6: ob.Account_Deletion();
				break;
		case 7: ob.view();
				break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("Enter y to continue and n to exit");
		 op=sc.next().charAt(0);
		if(op=='n')
		{
			break;
		}
		}
		while(op=='y');
		

	}

}
