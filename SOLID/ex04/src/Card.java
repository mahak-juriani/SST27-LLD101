public class Card implements PaymentService{
    public String pay(double amount){
        return "Charged card: " + amount;
    }
}
