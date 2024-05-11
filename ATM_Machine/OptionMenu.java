package ATM_Machine;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class OptionMenu extends Account {

    Scanner sc = new Scanner(System.in);
    DecimalFormat monayFormat = new DecimalFormat(" '$' ###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    int num;

    public void getlogin() throws IOException {
        int x = 1;

        do {
            try {
                data.put(101, 123);
                data.put(102, 456);

                System.out.println("enter the accountID");
                setAccountID(sc.nextInt());

                System.out.println("enter the pin number");
                setPin(sc.nextInt());

            } catch (Exception e) {
                System.out.println("somthing wrong");

            }

            for (Map.Entry<Integer, Integer> map : data.entrySet()) {
                if (map.getKey() == getAccountID() && map.getValue() == getPin()) {
                    AccountType();
                }

            }
            System.out.println("invalid account number and pin!!");
            x++;
        } while (x == 1);
    }

    public void AccountType() {
        System.out.println("select the account type");
        System.out.println("1-> current account");
        System.out.println("2-> saving account");
        System.out.println("3-> exit");

        num = sc.nextInt();
        switch (num) {
            case 1:
                currentAccount();

                break;

            case 2:
                savingAccount();

                break;

            case 3:
                System.out.println("thanks for visiting ATM!@$");
                break;

            default:
                System.out.println("you have invalid process in atm");
                AccountType();
                break;
        }
    }

    public void currentAccount() {
        System.out.println("current account");
        System.out.println("1-> balance cheaking");
        System.out.println("2-> withdrawal balance");
        System.out.println("3-> deposite the money");
        System.out.println("4-> exit");

        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("you have " + getCurrentBalance() + "money");
                AccountType();
                break;

            case 2:
                System.out.println("enter the amount:");
                currentWithdrawalProcess();
                AccountType();
                break;

            case 3:
                System.out.println("enrrer");
                currentDepositeProcess();
                AccountType();
                break;

            case 4:
                System.out.println("thank for visiting !!");
                break;

            default:
                System.out.println("you have invalid current account process");
                break;
        }
    }

    public void savingAccount() {
        System.out.println("wellcome in saving account!!");
        System.out.println("1-> balance cheaking");
        System.out.println("2-> withdrawal money");
        System.out.println("3-> deposite money");
        System.out.println("4-> exit");

        num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("your saving balance :" + getSavingAmount());
                AccountType();
                break;

            case 2:
                System.out.println("withdrawal");
                savingWithdrawProcess();
                AccountType();
                break;

            case 3:
                System.out.println("deposite");
                savingDepositeProcess();
                AccountType();
                break;

            case 4:
                System.out.println("thank for visiting saving account");
                break;

            default:
                System.out.println("you have invalid saving account process!!");
                break;
        }
    }

}
