package com.gla.assignment7.Part1.Level1.Level2;
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Main2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Shubh", "123456", 10000);
        acc.deposit(2000);
        acc.withdraw(5000);
        acc.displayBalance();
    }
}

