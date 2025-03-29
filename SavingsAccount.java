import java.util.*;
import java.io.*;

class SavingsAccount extends CheckingAccount {
  double interestRate = 0.05;  

  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount();
    sa.start();
  }

  public void applyInterest() {
    double interestAmount = this.balance * this.interestRate;
    this.balance += interestAmount;
    System.out.println("Interest applied. New Balance: " + this.getBalanceString());
  }

  public void setInterestRate(double rate) {
    this.interestRate = rate;
  }


  public double getInterestRate() {
    return this.interestRate;
  }
}
