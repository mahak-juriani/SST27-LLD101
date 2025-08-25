public class Wallet implements PaymentService {
    public String pay(double amount){
        return "Wallet debit: " + amount;
    }
}
