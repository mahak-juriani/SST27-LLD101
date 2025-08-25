public class StandardShipment implements ShipmentType{

    @Override
    public double cost(double w) {
        return 50 + 5*w;
    }
    
}
