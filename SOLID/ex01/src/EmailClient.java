package src;

public class EmailClient implements ICustomerInvoice{
    public void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
}