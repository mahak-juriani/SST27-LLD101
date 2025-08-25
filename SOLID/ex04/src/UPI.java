public class UPI implements PaymentService {
    public String pay(double amount){
        return "Paid via UPI: " + amount;
    }
}
