package src;

public class OrderService {
    ICustomerInvoice notifyCustomerRepo;
    TaxCalculation tax;

    OrderService(ICustomerInvoice notifyCustomerRepo, TaxCalculation tax) {
        this.notifyCustomerRepo = notifyCustomerRepo;
        this.tax = tax;
    }

    void checkout(String customerEmail, double subtotal) {
        double totalWithTax = tax.getTotalWithTax(subtotal);
        notifyCustomerRepo.send(customerEmail, "Thanks! Your total is " + totalWithTax);
        System.out.println("Order stored (pretend DB).");
    }
}