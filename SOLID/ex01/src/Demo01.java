

public class Demo01 {
    public static void main(String[] args) {
        iNotificationService notifier = new EmailClient();
        double taxRate = 0.18;
        TaxCalculator taxCalculator = new TaxCalculator(taxRate);
        OrderService service = new OrderService(notifier, taxCalculator);
        service.checkout("a@shop.com", 200.0);  
    }
}
