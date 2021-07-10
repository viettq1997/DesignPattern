package behaviorDesignPattern.strategyDesignPattern;

public class EightyDiscountStrategy implements IPromoteStrategy {

    @Override
    public double DoDiscount(double price) {
        return price * 0.8;
    }
    
}
