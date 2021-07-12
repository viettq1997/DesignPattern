package behaviorDesignPattern.StrategyDesignPattern;

public class NoDiscountPromoteStrategy implements IPromoteStrategy{

    @Override
    public double DoDiscount(double price) {
        return price;
    }
    
}
