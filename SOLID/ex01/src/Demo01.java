package src;

public class Demo01 {
    public static void main(String[] args) {

        ICustomerInvoice notifuyCustomerRepo= new WhatsAppClient();
        TaxCalculation tax= new TaxCalculation();


        OrderService orderSer = new OrderService(notifuyCustomerRepo, tax);
        orderSer.checkout("a@shop.com", 120.0);
    }
}
