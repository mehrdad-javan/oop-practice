package se.lexicon.model;

//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.BankAccount;
import se.lexicon.model.Customer;

public class BankAccountTest {


    BankAccount testAccount;


    @BeforeEach
    public void setup() {
        Customer testCustomer = new Customer("test.test@test.se", "Test Testsson", "987654321");
        testAccount = new BankAccount(1000.0, testCustomer);
    }

    @Test
    public void testAccountNumber(){
        long expectedResult = 1;
        long actualResult = testAccount.getAccountNumber();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAccountNumber_2(){
        Customer customer2 = new Customer("test","TEST", "11111111");
        BankAccount bankAccount2 = new BankAccount(100, customer2);
        long expectedResult = 2;
        long actualResult = bankAccount2.getAccountNumber();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeposit() {
        testAccount.deposit(500.0);
        double expectedBalance = 1500;
        double actualBalance = testAccount.getBalance(); // 1500.0
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testWithdraw() {
        testAccount.withdraw(200.0);
        assertEquals(800.0, testAccount.getBalance());
    }


    @Test
    public void testNegativeAmountToWithdraw_ThrowsIllegalArgumentException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> testAccount.withdraw(-100)
        );
    }

    // add more unit tests


}
