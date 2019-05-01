package other.goods;

public class Car extends  Goods {
    public Car(Enum kind, String name, double basePrice) {
        super(kind, name, basePrice);
    }
    public enum kindsCars{
        BMW,
        AUDI,
        MERSEDES,
        WOLKSVAGEN,
        PORSHE,
        HONDA
    }
}
