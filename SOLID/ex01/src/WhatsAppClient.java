package src;
public class WhatsAppClient implements ICustomerInvoice {

    public void send(String to, String body) {
        System.out.println("[whats app message to ] "+to +" sent subtotal : "+body);
    }
    
}
