package office_hour;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void showBalance(){
        String acct = " " + accountNumber;
        String accountNumber= "**********" + acct.substring(12);
        System.out.println("Account holder: " + accountHolder );
        System.out.println("Account NUmber: " + accountNumber );
        System.out.println("Available balance : $ " +balance );
        System.out.println("===================");
    }

    public void deposit(double amount){

        String acct= "" + accountNumber;
        String accountNumber= "************" + acct.substring(12);
        System.out.println("Depositing $ " + amount +
                " to account " + accountNumber);
        balance += amount;
        System.out.println("New Balance " + balance);
        System.out.println("================");
    }
    public void withDraw(double amount){
        if(balance <= 0){
            System.out.println("Balance is not available"  );
        }
        String acct = " " + accountNumber;
        String accountNumber = "**********" + acct.substring(12);
        System.out.println("Withdrawing $ " + amount + " from the account " + accountNumber);
        System.out.println("New balance " + balance);
        balance -= amount;
        if(balance < 0){
            balance -=35;
        }
    }
    public void accountSetUp(String name, long acctNum){
        accountHolder = name;
        accountNumber= acctNum;

    }
}
