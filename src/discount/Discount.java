package discount;

public class Discount implements DiscountType {

    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
