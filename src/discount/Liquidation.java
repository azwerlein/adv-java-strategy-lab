package discount;

public class Liquidation implements DiscountType {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
