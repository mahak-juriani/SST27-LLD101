public class OverNightShipment implements ShipmentType {
    public double cost(double w){
        return 120 + 10*w;
    }
}
