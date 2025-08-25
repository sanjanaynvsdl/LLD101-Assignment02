package src;

public class PaymentService {

    Payment payService;

    public PaymentService(Payment payService) {
        this.payService = payService;
    }

    String pay() {
        // switch (p.provider) {
        // case "CARD": return "Charged card: " + p.amount;
        // case "UPI": return "Paid via UPI: " + p.amount;
        // case "WALLET": return "Wallet debit: " + p.amount;
        // default: throw new RuntimeException("No provider");
        // }
        
        //pay refers to the respective object priovded in constructor
        String payservice = payService.pay(); 
        return payservice;
    }
}