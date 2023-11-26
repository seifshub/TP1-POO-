public class TestBankAccount {
    public static void main(String[]ar)
    {
        BankAccount b1=new BankAccount(1,"seif",100);
        b1.affiche();

        b1.deposit(100);
        System.out.println("\nAfter depositing 100:");
        b1.affiche();

        b1.withdraw(50);
        System.out.println("\nAfter withdrawing 50:");
        b1.affiche();
    }
}
