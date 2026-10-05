/*
    Jonathon Walmsley
    Module 10.2
    Description: Subclass of Division adding a state field.
*/

public class DomesticDivision extends Division {
    private final String state;

    // Constructor requiring all fields (passes divisionName and accountNumber to super class)
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("--- Domestic Division ---");
        System.out.println("Division Name : " + this.divisionName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("State         : " + this.state);
        System.out.println();
    }
}