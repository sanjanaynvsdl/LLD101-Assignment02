package src;

public class TaxCalculation {
    private double taxRate = 0.18;

    double getTotalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
    
}
