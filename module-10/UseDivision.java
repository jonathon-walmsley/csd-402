/*
    Jonathon Walmsley
    Module 10.2
    Description: Driver application creating two instances of each concrete class.
*/

public class UseDivision {
    public static void main(String[] args) {

        // Two instances of InternationalDivision
        InternationalDivision intlDiv1 = new InternationalDivision(
            "European Operations",
            "INT-10492",
            "Germany",
            "German"
        );

        InternationalDivision intlDiv2 = new InternationalDivision(
            "Latin America Logistics",
            "INT-20811",
            "Mexico",
            "Spanish"
        );

        // Two instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision(
            "Midwest Sales",
            "DOM-44019",
            "Nebraska"
        );

        DomesticDivision domDiv2 = new DomesticDivision(
            "Pacific Northwest Support",
            "DOM-88123",
            "Washington"
        );

        // Display all 4 instances
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}