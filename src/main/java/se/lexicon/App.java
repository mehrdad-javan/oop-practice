package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Customer customer1 = new Customer("test@test.se","Test Testson", "123456789");
        BankAccount bankAccount1 = new BankAccount(100, customer1);
        System.out.println("Balance: " + bankAccount1.getBalance());
        bankAccount1.deposit(20);
        System.out.println("Balance: " + bankAccount1.getBalance()); // 120
        bankAccount1.withdraw(10);
        System.out.println("Balance: " + bankAccount1.getBalance()); // 110
        bankAccount1.withdraw(300);
        System.out.println("Balance: " + bankAccount1.getBalance()); // throws error

    }
}
