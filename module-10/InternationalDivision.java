/*
    Jonathon Walmsley
    Module 10.2
    Description: Subclass of Division adding country and language fields.
*/

public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    // Constructor requiring all fields (passes divisionName and accountNumber to super class)
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("--- International Division ---");
        System.out.println("Division Name : " + this.divisionName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Country       : " + this.country);
        System.out.println("Language      : " + this.language);
        System.out.println();
    }
}