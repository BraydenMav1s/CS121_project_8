import java.util.Scanner;

public class CheckingAccount implements HasMenu {
    private double balance;

    public CheckingAccount() {
        this.balance = 0.0;
    }

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void makeDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    public void makeWithdrawal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void menu() {
        System.out.print("1) Get your current balance.\n");
        System.out.print("2) Deposit money into an account.\n");
        System.out.print("3) Withdraw money from an account.\n");
        System.out.print("0) Exit\n");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            if (choice == 1) checkBalance();
            else if (choice == 2) makeDeposit();
            else if (choice == 3) makeWithdrawal();
            else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100);
        account.start();
    }
}
