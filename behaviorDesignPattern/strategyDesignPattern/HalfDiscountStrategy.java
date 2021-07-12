package behaviorDesignPattern.StrategyDesignPattern;

public class HalfDiscountStrategy implements IPromoteStrategy {

    @Override
    public double DoDiscount(double price) {
        return price * 0.5;
    }
}
