package other.goods;

public abstract class Goods {
   private Enum kind;
    private String name;
    private double basePrice;

    public Goods(Enum kind, String name, double basePrice) {
        this.kind = kind;
        this.name = name;
        this.basePrice = basePrice;
    }

    public Enum getKind() {
        return kind;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
