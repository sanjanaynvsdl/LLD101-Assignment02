package src;


public class Demo01 {
    public static void main(String[] args) {

        ICustomerInvoice notifuyCustomerRepo= new WhatsAppClient();
        new OrderService(notifuyCustomerRepo).checkout("a@shop.com", 120.0);
     
    }
}
