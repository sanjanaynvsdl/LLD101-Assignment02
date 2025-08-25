package src;

public class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public String pay() {
        System.out.println("Paid via CARD: " + amount);
        return "Paid via CARD: " + amount;
    }

}
