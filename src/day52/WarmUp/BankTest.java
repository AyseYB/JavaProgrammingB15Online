package day52.WarmUp;

import day52.WarmUp.Account;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("Zeynep", 10000);
        Account a2 = new Account("Yusuy", 8000);
        System.out.println("a1 before " + a1);
        System.out.println("a2 before " + a2);
        a1.transferAll(a2);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.isPalindrome());
        System.out.println(a2.isPalindrome());
    }
}
