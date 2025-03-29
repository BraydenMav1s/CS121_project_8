import java.util.*;
import java.io.*;

abstract class User implements HasMenu{

  String userName;
  String PIN;

  public boolean login(){
    Scanner input = new Scanner(System.in);
    System.out.print("User name: ");
    userName = input.nextLine();
    System.out.print("PIN: ");
    PIN = input.nextLine();
    if(userName.equals("admin")){
      if(PIN.equals("0000")){
        return true;
      }
    }
    return false;
    
  } 

  public boolean login(String userName,String PIN){
    if(userName.equals(this.userName)){
      if(PIN.equals(this.PIN)){
        System.out.print("Login Successful");
	return true;
      } 
    } 
    return false;
  } 

  public void setUserName(String userName){
    this.userName = userName;
  } 

  public String getUserName(){
    return this.userName;
  } 
  public void setPIN(String pin){
    if(pin.matches("^\\d{4}$)")){
      this.PIN=pin;
    }
    else{
      System.out.print("Not four digits");
    }
  } 

  public String getPIN(){
    return this.PIN;
  } 

  abstract String getReport();
} 