package discount;

public class Sale implements DiscountType {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
