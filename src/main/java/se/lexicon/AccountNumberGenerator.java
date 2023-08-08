package se.lexicon;

public class AccountNumberGenerator {

    private static long accountNumberCounter = 0;

    public static long generateNextAccountNumber(){
        return ++accountNumberCounter;
    }

}
