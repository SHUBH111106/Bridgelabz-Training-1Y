package com.gla.assignment7.Part2.Level3;
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public void display() {
        System.out.println(accountNumber + " | " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = "ACC123";
        s.accountHolder = "Shubh";
        s.setBalance(10000);
        s.display();
        System.out.println("Balance: " + s.getBalance());
    }
}

