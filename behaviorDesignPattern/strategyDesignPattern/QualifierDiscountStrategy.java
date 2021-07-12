package behaviorDesignPattern.StrategyDesignPattern;

public class QualifierDiscountStrategy implements IPromoteStrategy{

    @Override
    public double DoDiscount(double price) {
        return price * 0.75;
    }
    
}
