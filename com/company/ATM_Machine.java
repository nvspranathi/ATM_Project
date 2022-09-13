package com.company;
import java.util.Scanner;
public class ATM_Machine
{
    public static void main(String[] args )
    {
        int balance = 0, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation:");
            //get choice from user
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance >= withdraw)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposit amount from the user
                    deposit = sc.nextInt();
                    //add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }
        }
    }
}
