package src;

public class WalletPayment  extends Payment{
        public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    public String pay() {
        System.out.println("Paid via Wallet: " + amount);
        return "Paid via Wallet: " + amount;
    }
    
}
