package src;

public class Bicycle implements IBicycle {
    // public void startEngine(){ throw new UnsupportedOperationException(); }
    public void pedal(int effort){ System.out.println("Pedal effort " + effort); }
    // public void recharge(int kWh){ throw new UnsupportedOperationException(); }
}