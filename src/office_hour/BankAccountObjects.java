package office_hour;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.accountHolder= "Yusuf Bilgic";
        account1.accountNumber=123456789123456L;

        account1.showBalance();
        account1.deposit(2000);
        account1.deposit(4000);
        account1.withDraw(3000);
        account1.withDraw(3001);
        account1.withDraw(2000);


        BankAccount account2 = new BankAccount();
        account2.accountSetUp("Emin", 1234567891234567L);
        account2.showBalance();





    }
}
