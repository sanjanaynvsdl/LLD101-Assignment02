package src;
public class UPIPayment  extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public String pay() {
        System.out.println("Paid via UPI: " + amount);
        return "Paid via UPI: " + amount;
    }
    
}
