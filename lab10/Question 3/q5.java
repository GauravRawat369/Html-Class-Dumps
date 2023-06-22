//  Write a java program to create Account with 500 rupee minimum balance, deposit amount,
// withdraw amount and also throws LessBalanceException which returns the statement that says
// withdraw amount is not valid.

class LessBalanceException extends Exception{
    LessBalanceException(String s){
        super(s);
    }
}
class q5{
    int balance;
    q5(int balance){
        this.balance = balance;
    }
    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount) throws LessBalanceException{
        if(balance - amount < 500){
            throw new LessBalanceException("Withdraw amount is not valid");
        }
        balance -= amount;
    }
    void display(){
        System.out.println("Balance: " + balance);
    }
    public static void main(String [] args)
    {
        q5 acc = new q5(1000);
        acc.display();
        try{
            acc.withdraw(500);
            acc.display();
            acc.withdraw(500);
            acc.display();
        }
        catch(LessBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}