public class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    public BankAccount(int accountNumber,String accountHolderName,int balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    int getBalance()
    {
        return balance;
    }
    public void deposit(int amount)
    {
        balance+=amount;
    }
    public void withdraw(int amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
        }
        else {
            System.out.println("Balance not sufficient!\n");
        }
    }
    public void affiche()
    {
        System.out.println("account number: "+getAccountNumber()+"\nholder name: "+getAccountHolderName()+"\nbalance: "+getBalance());
    }
}
