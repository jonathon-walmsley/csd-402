/*
    Jonathon Walmsley
    Module 10.2
    Description: Abstract superclass representing a company division.
*/

public abstract class Division {
    protected String divisionName;
    protected String accountNumber;

    // Constructor requiring values for both superclass fields
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by concrete subclasses
    public abstract void display();
}