import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

class BankAccount {


  double balance;
  double prevTransaction;
  String customerName;
  String customerId;
  // + :deposit  , - :withdraw

  BankAccount(String customerName, String customerId) {
    this.customerName = customerName;
    this.customerId = customerId;
    this.balance = 0.0;

  }

  void deposit(double amount) {

    balance += amount;
    prevTransaction = amount;

  }

  void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      prevTransaction = -amount;
    }

    else{
        System.out.println("Withdrawl fails by  ₹"  + (amount - balance));
        prevTransaction = 0;
    }
  }

  void getPreviousTransaction() {
    if (prevTransaction > 0)
      System.out.println("Amount deposited  :  ₹" + prevTransaction);
    else if (prevTransaction < 0)
      System.out.println("Amount withdrawn :  ₹" + Math.abs(prevTransaction));
    else
      System.out.println("No transation occured");
  }

//  void transfer(double amount,String cId,BankAccount acc){
//
//             if(this.balance < amount)
//             {
//                 System.out.println("*****************************************************************");
//                 System.out.println("Transfers fails by ₹"+(amount - this.balance));
//                 System.out.println("*****************************************************************");
//             }
//
//             else
//             {
//                 System.out.println("*****************************************************************");
//                 this.balance -= amount;
//                 acc.balance = amount;
//                 System.out.println("Amount of "+this.customerName + " becomes₹"+ this.balance);
//                 System.out.println("Amount of "+this.customerName + " becomes₹"+ acc.balance);
//                 System.out.println("*****************************************************************");
//             }
//
//
//  }

  void showMenu() {
    char option = '\0';
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome " + customerName);
    System.out.println("Your ID : " + customerId);
    System.out.println("\n");
    System.out.println("A. Check Balance");
    System.out.println("B. Deposit");
    System.out.println("C. Withdraw");
    System.out.println("D. Previous Transaction");
    System.out.println("E. Exit");


    do {
      System.out.println("*****************************************************************");
      System.out.println("Enter an option:");
      System.out.println("*****************************************************************");
      option = sc.next().charAt(0);
      System.out.println("\n");

      switch(option)
      {
        case 'A': System.out.println("-------------------------------------");
                  System.out.println("Balance =" + balance);
                  System.out.println("-------------------------------------");
                  System.out.println("\n");
                  break;

        case 'B': System.out.println("-------------------------------------");
                  System.out.println("Enter an amount to deposit:");
                  System.out.println("-------------------------------------");
                  double amount1 = sc.nextDouble();
                  deposit(amount1);
                  System.out.println("\n");
                  break;

        case 'C': System.out.println("-------------------------------------");
                  System.out.println("Enter an amount to withdraw");
                  System.out.println("-------------------------------------");
                  double amount2 = sc.nextDouble();
                  withdraw(amount2);
                  System.out.println("\n");
                  break;


        case 'D': System.out.println("-------------------------------------");
                  getPreviousTransaction();
                  System.out.println("-------------------------------------");
                  System.out.println("\n");
                  break;

        case 'E': System.out.println("-------------------------------------");
                  break;


        default:
                  System.out.println("Invalid Option!!. Please Enter again");
                  break;
      }

    } while (option != 'E');
      System.out.println("Thank You for using our services :)");
  }
}
