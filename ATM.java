import java.util.Scanner;
public class ATM {
    static int balance=0;
    static int min_balance=1500;
    public static void withdraw(int amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount withdrawn: "+amount);
            System.out.println("Remaining balance is "+balance);
        }
        else{
            System.out.println("No sufficient amount in the account");
        }
    }
    public static void deposit(int amount){
        balance=balance+amount;
        System.out.println("Amount Successfully Deposited!");
    }
    public static void showBalance(int balance){
        System.out.println("Balance remaining in the account is: "+balance);
        if(balance<min_balance){
            System.out.println("Please deposit "+(min_balance-balance)+" rupees and make sure of maintaining at least "+min_balance);
        }
        else System.out.println("Happy Banking!");
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        while(true){
            System.out.println("Welcome!");
            System.out.println("Choose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance ");
            System.out.println("Choose 4 to Exit");
            System.out.println("Enter your choice: ");
            int choice= inp.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter amount to be withdrawn: ");
                    int amount=inp.nextInt();
                    withdraw(amount);
                    break;
                case 2:
                    System.out.println("enter amount to be deposited: ");
                    amount=inp.nextInt();
                    deposit(amount);
                    break;
                case 3:
                    showBalance(balance);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}