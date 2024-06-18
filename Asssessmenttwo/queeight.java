package Asssessmenttwo;

import java.util.Scanner;
class BankAccount
{
    double ano;
    String aname;
    int abal;
    int damo;
    int wamo;
    Scanner sc = new Scanner(System.in);
    void deposit()
    {
        
        System.out.println("Enter an amount to Deposit");
        damo = sc.nextInt();
        abal += damo;
        System.out.println(" updated Balance"+ " "+abal);
        
    }
    void withdraw()
    {
        System.out.println("Enter an amount to Withdraw");
        wamo = sc.nextInt();
        abal -= wamo;
        System.out.println("updated balance "+" "+abal);
    }
    void CheckBalance()
    {
         System.out.println("Enter account balance");
        abal =sc.nextInt();
        System.out.println("Balance"+" "+abal);
    }
    
}
class SavingsAccount extends BankAccount
{
    int interest;
    int iamo;
    void applyInterest()
    {
        System.out.println("Enter the interest rate");
        interest = sc.nextInt();
        iamo = abal*interest*1;
        abal += iamo;
        System.out.println("updated balance after adding one year interest "+" "+abal);
        
    }
}


public class queeight {

}
