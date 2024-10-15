package Exam01;

import java.util.Arrays;

class Account{
    public int number;
    private String password;
    private int balance;

    public Account(int number, String password, int balance){
        this.number = number;
        this.password = password;
        this.balance = balance;
        System.out.println(number + "\n" + password + "\n" + balance);
    }
    public int getHack(){
        return balance;
    }
    public void setHack(int bs){
        this.balance = bs;
    }
}

class Hacker{
    /*public static void Hack(Account account) {
        account.balance = 0;
    }*/
}

public class Gen {
    public static void main(String[] args) {
        Account acc = new Account(123456, "SD#@1!", 1000);
        acc.setHack(0);
        System.out.println(acc.getHack());
    }
}
