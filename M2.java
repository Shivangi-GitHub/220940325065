import java.util.Scanner;
class User extends Exception{
	User(String str)
	{
		super(str);
	}
}
class BankAccount
{
	int accno;
	double balance;
	Scanner sc=new Scanner(System.in);
	void details()
	{
		System.out.println("enter detail");
		
		accno=sc.nextInt();
		balance=sc.nextDouble();
	}
	
 void withdraw()
	{
		System.out.println("enter amount");
		double amount=sc.nextDouble();
		System.out.println("Enter Withdrawal ammount");
		if (amount>balance)
		{
			try
			{
				throw new User("this is user defined exception: you cannot withdraw as your account balance is low");
				
			}
			catch(User e)
			{
				System.out.println("caught exception");
				System.out.println(e.getMessage());
			}
		}
			else
			{
				balance=balance-amount;
				System.out.println(balance);
			}
			
			
	}
			
			
		
		
	void deposit()
	{
		System.out.println("enter Deposit amount");
		double deposit=sc.nextDouble();
		
		balance=balance+deposit;
		System.out.println("You account balance is : " +balance);
	}
 void show1()
	{
		System.out.println("You account details : " +"Account No is  " +accno +"  balance is  " +balance);
	}
}

class demo
{
	public static void main(String args[])
	{
		BankAccount n= new BankAccount();
		//Scanner sc=new Scanner(System.in);
		//n.balance();
		n.details();
		n.withdraw();
		n.deposit();
		n.show1();
	}
}