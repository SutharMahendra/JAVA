package ATM_Machine;

import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

import javax.sound.midi.Soundbank;

public class Account {

    Scanner sc1 = new Scanner(System.in);
    private int accountID;
    private int pin;
    private double currentBalance = 0;
    private double SavingAmount = 0;

    // set the custmer account id
    public int setAccountID(int accountID) {
        this.accountID = accountID;
        return accountID;
    }

    // get the custmer account id
    public int getAccountID() {
        return accountID;
    }

    // set the custmer pin
    public int setPin(int pin) {
        this.pin = pin;
        return pin;
    }

    // get the custmer pin
    public int getPin() {
        return pin;
    }

    // get current balance in account
    public double getCurrentBalance() {
        return currentBalance;
    }

    // this is for withdrawal process
    public void currentWithdrawalProcess() {
        System.out.println("enter the amount:");
        int amount = sc1.nextInt();

        if ((currentBalance - amount) > 0) {
            System.out.println("withdrawal will be succsessfully !!");
            currentBalance = currentBalance - amount;
            System.out.println("your current balance :" + currentBalance);
        } else {
            System.out.println("invalid bank balance");

        }
    }

    // this is for deposite process
    public void currentDepositeProcess() {
        System.out.println("enter the amount that you want to deposite");

        int amount = sc1.nextInt();

        if ((currentBalance + amount) > 0) {
            currentBalance = currentBalance + amount;
            System.out.println("deposite process done sucessfully!!");
        } else {
            System.out.println("you have dont have valid bank");
        }
    }

    // here you receive saving amount
    public double getSavingAmount() {
        return SavingAmount;
    }

    // this is for withdrawal process
    public void savingWithdrawProcess() {
        System.out.println("enter the amount that you want to withdraw");
        int amount = sc1.nextInt();
        if ((SavingAmount - amount) > 0) {
            System.out.println("withdraw amuont successfully!!");
            SavingAmount = SavingAmount - amount;
            System.out.println("you saving bankbalance:" + SavingAmount);
        } else {
            System.out.println("you not have valid bankbalance");
        }
    }

    // this is for deposite process
    public void savingDepositeProcess() {
        System.out.println("enter the amount that you want to deposite");
        int amount = sc1.nextInt();

        if ((SavingAmount + amount) > 0) {
            System.out.println("deposite process done successfully!!");
            SavingAmount = SavingAmount + amount;
            System.out.println(" your savingAmount : " + SavingAmount);
        } else {
            System.out.println("you dont have valid bankbalance");
        }
    }

}
