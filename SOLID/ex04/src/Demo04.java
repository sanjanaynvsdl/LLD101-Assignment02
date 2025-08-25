package src;

public class Demo04 {
    public static void main(String[] args) {
        // System.out.println(new PaymentService().pay(new Payment("UPI", 499)));

        //creating the obj of respective types, 
        Payment upiPay= new UPIPayment(499);
        Payment cardPay = new CardPayment(699.90);

        PaymentService payService = new PaymentService(cardPay);

        String paid = payService.pay();
        System.out.println(paid);
    }
}
