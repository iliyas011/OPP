package LAB2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank(); 

        SavingsAccount savings = new SavingsAccount(101, 5.0); 
        savings.deposit(1000); 

        CheckingAccount checking = new CheckingAccount(102); 
        checking.deposit(500);
        checking.withdraw(100);
        checking.deposit(50);
        checking.withdraw(10); 

        myBank.openAccount(savings); 
        myBank.openAccount(checking);

        System.out.println("--- Before Bank Update ---");
        System.out.println(savings);
        System.out.println(checking);


        myBank.update();

        System.out.println("\n--- After Bank Update ---");
        System.out.println(savings);
        System.out.println(checking);


        myBank.closeAccount(101);
        System.out.println("\nAccount #101 has been closed.");
    }
}