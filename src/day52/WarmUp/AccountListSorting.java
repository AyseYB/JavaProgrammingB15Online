package day52.WarmUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add( new Account("Jon Snow", 10000));
        accountList.add(new Account("Vald", 11000));
        accountList.add(new Account("Sventlana", 13000));
        accountList.add(new Account("Muhammad", 8000));
        accountList.add(new Account("Emme", 17000));
        accountList.add(new Account("Ata", 15000));

        System.out.println("account list before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("account list after = \n" + accountList);

        // Create another account with your name :
        // transfer everyone's money to your account
        Account myAccount = new Account("Ayse", 0);

        for ( Account each: accountList){
            each.transferAll(myAccount);
        }
        System.out.println(accountList);
        System.out.println("My Account" + myAccount);



        // What can be the data type of a1
        /*
         * Account a1 ;
         * Comparable a1 ;
         * Transferable a1 ;
         * Object a1
         *
         * An object can be referred by
         *       it's own type
         *       it's super class type
         *       interface type that it implemented
         *
         * */
        Account a1 = new Account("Polimorphism1",10000);
        Comparable c1 = new Account("Polimorphism2", 10000);
        Transferable t1 = new Account("Polimorphism3", 10000);
        Object o1 = new Account("Polimorphism4",10000);











    }
}
