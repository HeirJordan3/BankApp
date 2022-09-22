import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Jordan Eldridge ", "A001");
        obj1.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String cutsomerName;

    public BankAccount(String cutsomerName, String customerId) {
        this.cutsomerName = cutsomerName;
        this.customerId = customerId;
    }

    String customerId;


    void deposit(int amount){
        // if amount is not equal to 0 the do the rest
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withDraw(int amount){
        if (amount != 0 ){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        // if it is greater than 0
        if (previousTransaction > 0 ){
            System.out.println("Deposited: " + previousTransaction);
        }else if (previousTransaction < 0){
            // it will give us a positive value
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }else {
            System.out.println("No Transaction occured");
        }
    }

    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + cutsomerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance ");
        System.out.println("B. Deposit ");
        System.out.println("C. Withdraw ");
        System.out.println("D. Previous Transaction ");
        System.out.println("E. Exit ");

        do {
            System.out.println("====================================================================");
            System.out.println("Enter an option");
            System.out.println("====================================================================");
            // reading the response from the user
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("-------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("-------------------------");
                    System.out.println("\n");
                    break;


                case 'B':
                    System.out.println("-------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("-------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-------------------------");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("-------------------------");
                    int amount2 = scanner.nextInt();
                    withDraw(amount2);
                    System.out.println("\n");
                    break;


                case 'D':
                    System.out.println("-------------------------");
                    getPreviousTransaction();
                    System.out.println("-------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("************************************");
                    break;
                default:
                    System.out.println("Invalid Option ! Please enter again ");
                    break;

            }

        }while (option != 'E') ;
        System.out.println(" Thank you for using our services ");


    }

}
