import java.util.*;
import java.io.*;

class CheckingAccount implements HasMenu{
  double balance;

  public static void main(String[] args){
    CheckingAccount ca = new CheckingAccount();
    ca.start();
  } 

  public CheckingAccount(){
    this.balance = 0d;
  }  

  public CheckingAccount(double balance){

  } 

  public void start(){
    boolean keepGoing=true;
    while(keepGoing){
      String response = menu();
      if(response.equals("0")){
        keepGoing=false;
      } 
      if(response.equals("1")){
        System.out.println("Checking balance...");
	this.checkBalance();
      } 
      if(response.equals("2")){
        System.out.println("Making a deposit...");
	this.makeDeposit();
      } 
      if(response.equals("3")){
        System.out.println("Making a withdrawal...");
	this.makeWithdrawal();
      } 

    } 
  } 
  public String menu(){
    System.out.println("\n\nAccount menu\n");
    Scanner input = new Scanner(System.in);
    System.out.println("0) Quit");
    System.out.println("1) Check balance");
    System.out.println("2) Make a deposit");
    System.out.println("3) Make a withdrawal\n");
    System.out.println("Please enter 0-3: ");
    String user = input.nextLine();
    return user;
  } 

  public void checkBalance(){
    System.out.println("Current balance: " + this.getBalanceString());
  } 

  public String getBalanceString(){
    String result = String.format("$%.02f", this.balance);
    return result;
  } 

  public void makeDeposit(){
    System.out.print("How much to deposit? ");
    double depo = getDouble();
    this.balance = this.balance + depo;
    System.out.println("New balance: " + this.getBalanceString());
  } 

  public void makeWithdrawal(){
    System.out.print("How much to withdraw? ");
    double repo = getDouble();
    this.balance = this.balance - repo;
    System.out.println("New balance: " + this.getBalanceString());
  } 

  private double getDouble(){
    Scanner input = new Scanner(System.in);
    double num = 0d;
    String stringNum = input.nextLine();
    try{
      num = Double.parseDouble(stringNum);
    } 
    catch(Exception e){
      System.out.print("That is not a valid input");
      num = 0;
    } 
    
    return num;
  } 

} 