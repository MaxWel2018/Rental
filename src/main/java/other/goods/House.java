package other.goods;

public class House extends Goods {

    public House(Enum kind, String name, double basePrice) {
        super(kind, name, basePrice);
    }
    public enum kindHouses {
        ONE_BEDROOM,
        TWO_BEDROOM,
        SMART_HOUSE
    }

}
