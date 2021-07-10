package behaviorDesignPattern.strategyDesignPattern;

public class Ticket {

    /**
     * author: Viettq1997
     * Tach PromotePrice thành 1 interface để xử lý discount
     * Đây là trategy pattern
     */
    private IPromoteStrategy iPromoteStrategy;
    private double price;
    private String name;

    public IPromoteStrategy getiPromoteStrategy() {
        return iPromoteStrategy;
    }

    public void setiPromoteStrategy(IPromoteStrategy iPromoteStrategy) {
        this.iPromoteStrategy = iPromoteStrategy;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket(IPromoteStrategy promoteStrategy) {
        iPromoteStrategy = promoteStrategy;
    }

    public Ticket() {
    }

    /**
     * Khi dùng chỉ cần gọi hàm này và new ImplementClass()
     * @return
     */
    public double GetPromotePrice() {
        return iPromoteStrategy.DoDiscount(price);
    }
}
