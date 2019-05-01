package other.goods;

public class Moto extends Goods {
    public Moto(Enum kind, String name, double basePrice) {
        super(kind, name, basePrice);
    }

    public enum kindMoto {
        BMW,
        SUZUKI,
        KAWASAKI,
        YAMAHA,
        HARLEY_DAVIDSON

    }
}
