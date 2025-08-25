
public class Demo04 {
    public static void main(String[] args) {
        PaymentService card = new Card();
        Payment p = new Payment(card, 500) ;
        System.out.println(p.pay());

        PaymentService upi = new UPI();
        Payment p1 = new Payment(upi, 2000);
        System.out.println(p1.pay());
        PaymentService wallet = new Wallet();
        Payment p2 = new Payment(wallet, 200);
        System.out.println(p2.pay());
    }
}
