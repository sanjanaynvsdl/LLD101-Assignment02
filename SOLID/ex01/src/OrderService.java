package src;



public class OrderService {
    ICustomerInvoice notifyCustomerRepo;

    OrderService(ICustomerInvoice notifyCustomerRepo) {
        this.notifyCustomerRepo= notifyCustomerRepo;
    }
    
    // ICustomerInvoice email = new WhatsAppClient();
    TaxCalculation tax= new TaxCalculation();

    
    void checkout(String customerEmail, double subtotal) {


       double totalWithTax=tax.getTotalWithTax(subtotal);
        notifyCustomerRepo.send(customerEmail, "Thanks! Your total is " + totalWithTax);
        System.out.println("Order stored (pretend DB).");
    }
}