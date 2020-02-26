package day46;

public class SavingAccount extends BankAccount {

//     String accountHolder;
//    long accountNumber;
//    double balance;
    double interestRate ;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(String accountHolder, long accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Alp", 12345, 500, 0.042);
     //   System.out.println(s1);
     //   s1.withdraw(10000);
        s1.deposit(1000);
        System.out.println("s1 = " + s1);
    }

// TASK !!1
//override deposit method
//    in saving account , every depisit you make you will get interest added
//    according to your interest rate
//if you deposit 100$  your interest rate is 4.2 /100  then
//    your actual balance will increase with added interes
    @Override
    public void deposit(int amount){
        balance += amount + amount * interestRate;

    }




    @Override
    public void withdraw(int amount){
        super.withdraw(30);
        //balance -= (amount + 30)
        //balance -= amount-30 ;
        balance = balance -amount -30; //this is the penalty
    }

    @Override// its optional , once being used , it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
