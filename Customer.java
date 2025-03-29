import java.util.Scanner; 
import java.io.*;

class Customer extends User {
  
  CheckingAccount checking;
  SavingsAccount savings;

  public Customer() {
    this.userName = "admin";
    this.PIN = "0000";
    this.checking = new CheckingAccount();
    this.savings = new SavingsAccount();
  } 

  public Customer(String userName, String PIN) {
    this.userName = userName;
    this.PIN = PIN;
    this.checking = new CheckingAccount();
    this.savings = new SavingsAccount();
  }

  public static void main(String[] args) {
    Customer cu = new Customer();
    cu.start();
  } 

  public void start() {
    boolean keepGoing = true;
    while (keepGoing) {
      String response = menu();
      switch (response) {
        case "0":
          keepGoing = false;
          break;
        case "1":
          checking.start();
          break;
        case "2":
          savings.start();
          break;
        case "3":
          this.changePin();
          break;
        default:
          System.out.println("Invalid option. Please choose again.");
      }
    } 
  } 

  public String menu() {
    Scanner input = new Scanner(System.in);
    System.out.println("0) Exit");
    System.out.println("1) Manage Checking Account");
    System.out.println("2) Manage Savings Account");
    System.out.println("3) Change PIN");
    System.out.print("\nAction (0-3): ");
    return input.nextLine();
  } 

  public void changePin() {
    Scanner input = new Scanner(System.in);
    System.out.print("Change PIN: ");
    String newPin = input.nextLine();
    this.setPIN(newPin);  
  } 

  public String getReport() {
    System.out.println("User: " + this.userName);
    checking.checkBalance();
    savings.checkBalance();
    return "";
  } 

  public SavingsAccount getSavingsAccount() {
    return this.savings;
  }

  public CheckingAccount getCheckingAccount() {
    return this.checking;
  }
}
