public class Demo03 {
    public static void main(String[] args) {
        Shipment express = new Shipment(new ExpressShipment(), 2.0);
        System.out.println(express.price());

        Shipment standard = new Shipment(new StandardShipment(), 5.0);
        System.out.println(standard.price());

        Shipment overnight = new Shipment(new OverNightShipment(), 10);
        System.out.println(overnight.price());
    }
}
