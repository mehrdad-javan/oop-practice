package se.lexicon.model;

import se.lexicon.model.sequencer.AccountNumberGenerator;

public class BankAccount {

    // Fields
    private final long accountNumber;  // make the field final -> final means read only
    private double balance;
    private Customer customer;



    // move to helper class
    /*private static long accountNumberCounter = 0;

    private static long generateNextAccountNumber(){
        return ++accountNumberCounter;
    }*/


    public BankAccount(double balance, Customer customer) {
        this.accountNumber = AccountNumberGenerator.generateNextAccountNumber(); // ClassName.StaticMethodName
        this.balance = balance;
        this.customer = customer;
    }

    public long getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) throw new IllegalArgumentException("Customer was null.");
        this.customer = customer;
    }


    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot deposit a negative amount.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot withdraw a negative amount.");
        if (amount > balance) throw new IllegalArgumentException("Withdrawal denied: insufficient founds.");
        balance -= amount;
    }


}
