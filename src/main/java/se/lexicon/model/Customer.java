package se.lexicon.model;

public class Customer {

    private String email;
    private String name;
    private String phoneNumber;

    public Customer(String email, String name, String phoneNumber) {
        setEmail(email);
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email was null.");
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name was null.");
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) throw new IllegalArgumentException("PhoneNumber was null.");
        this.phoneNumber = phoneNumber;
    }
}
