import java.util.*;
import java.io.*;

class Bank implements HasMenu{

  Admin admin = new Admin();
  ArrayList<Customer> customers = new ArrayList<Customer>();

  public static void main(String[] args){
    Bank ba = new Bank();
    ba.start();
  } 

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("Bank Menu\n");
    System.out.println("0) Exit system");
    System.out.println("1) Login as admin");
    System.out.println("2) Login as customer\n");
    System.out.print("Action: ");
    String user = input.nextLine();
    return user;
  } 

  public void start(){
    boolean keepGoing=true;
    while(keepGoing){
      String response = menu();
      if(response.equals("0")){
        keepGoing=false;
      } 
      if(response.equals("1")){
        startAdmin();
      } 
      if(response.equals("2")){
        
      } 
    } 
  } 

  public void startAdmin(){
    Scanner input = new Scanner(System.in);
    boolean keepGoing=true;
    while(keepGoing){
      String response = admin.menu();
      if(response.equals("0")){
        keepGoing=false;
      } 
      if(response.equals("1")){
        System.out.println("John, 1000, 20");
      }
      if(response.equals("2")){
        System.out.println("add bob");
      } 
      if(response.equals("3")){
        System.out.print("More money");
      } 
    } 
  } 

} 