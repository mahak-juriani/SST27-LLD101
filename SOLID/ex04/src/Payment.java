public class Payment {
    PaymentService provider; double amount;
    Payment(PaymentService p, double a){ provider=p; amount=a; }

    String pay(){
        return provider.pay(amount);
    }
}