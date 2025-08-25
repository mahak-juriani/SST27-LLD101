public class ExpressShipment implements ShipmentType {

    @Override
    public double cost(double w) {
        return 80 + 8*w;
    } 
}
