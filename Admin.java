import java.util.*;
import java.io.*;

class Admin extends User {
  
  private List<Customer> customers;

  public Admin() {
    this.customers = new ArrayList<>();
    this.userName = "Admin";
    this.PIN = "0000"; 
  }

  public String menu() {
    Scanner input = new Scanner(System.in);
    System.out.println("Admin Menu\n");
    System.out.println("0) Exit this menu");
    System.out.println("1) Full customer report");
    System.out.println("2) Add user");
    System.out.println("3) Apply interest to savings accounts\n");
    System.out.print("Action: ");
    return input.nextLine();
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
          System.out.println(getReport());
          break;
        case "2":
          addUser();
          break;
        case "3":
          applyInterest();
          break;
        default:
          System.out.println("Invalid option. Please choose again.");
      }
    }
  } 

  
  public String getReport() {
    StringBuilder report = new StringBuilder("Customer Report:\n");
    for (Customer customer : customers) {
      report.append("User: ").append(customer.getUserName()).append("\n");
    }
    return report.toString();
  }

  public void addUser() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter new username: ");
    String newUsername = input.nextLine();
    System.out.print("Enter new PIN: ");
    String newPin = input.nextLine();
    
    Customer newUser = new Customer(newUsername, newPin);
    customers.add(newUser);
    System.out.println("User added successfully: " + newUsername);
  }

  public void applyInterest() {
    System.out.println("Applying interest to all savings accounts...");
    for (Customer customer : customers) {
      customer.getSavingsAccount().applyInterest();
    }
    System.out.println("Interest applied.");
  }

  public static void main(String[] args) {
    Admin admin = new Admin();
    admin.start();
  }
}
