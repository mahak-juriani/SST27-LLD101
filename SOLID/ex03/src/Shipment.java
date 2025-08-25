public class Shipment {
    ShipmentType type;
    double weightKg;
    Shipment(ShipmentType type, double w){ this.type=type; this.weightKg=w; }
    double price(){
        return type.cost(weightKg);
    }
}