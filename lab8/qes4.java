// Create a class Account with two overloaded constructors. First
// constructor is used for initializing, name of account holder, account
// number and initial amount in account. Second constructor is used for
// initializing name of account holder, account number, addresses, type of
// account and current balance. Account class is having methods Deposit
// (), Withdraw (), and Get_Balance().Make necessary assumption for data
// members and 

class account
{
    String name;
    int acc_no;
    int ini_amt = 0;
    String address;
    String acc_type;
    int balance = 0;
    account(String name,int acc_no,int ini_amt)
    {
        this.name = name;
        this.acc_no= acc_no;
        this.ini_amt += ini_amt;
    }
    account(String name,int acc_no,String address,String acc_type,int balance)
    {
        this.name = name;
        this.acc_no= acc_no;
        this.address = address;
        this.acc_type=acc_type;
        this.balance = balance;
    }
    void Deposit(int value)
    {
       balance += value;
    }
    void Withdraw(int number)
    {
       balance -= number;
       System.out.println("baclance left : "+balance);
    }
    void view_bal()
    {
        System.out.println("total value in acc : "+balance);
    }
}


public class qes4
{
    public static void main(String []args)
    {
         account acc = new account("gaurav",1234,"haldwani","saving",100);
         acc.Deposit(10);
         acc.view_bal();
         acc.Withdraw(20);
    }
}