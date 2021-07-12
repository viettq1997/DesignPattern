package BehaviorDesignPattern.StrategyDesignPattern;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        System.out.println("Start getting tickets");

        var random = new Random();

        for(int i = 1; i <= 5; i++) {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket" + i);
            ticket.setPrice(50d * i);
            /**
             * Khi chúng ta chạy 2 lần thì sẽ generate lại 2 lần
             * Đây là thay đổi trong quá trình runtime
             */
            GeneratePromoteStrategy(random, ticket);
            LogTicketDetail(ticket);

            GeneratePromoteStrategy(random, ticket);
            LogTicketDetail(ticket);
        }
    }

    private static void LogTicketDetail(Ticket ticket) {
        System.out.println("Original price : " + 
        ticket.getPrice() + " Promoted price of " +
        ticket.getName() + " is " + ticket.GetPromotePrice());
    }

    private static void GeneratePromoteStrategy(Random random, Ticket ticket) {
        int stategyIndex = random.nextInt(4);
        switch(stategyIndex) {
            /**
             * nếu không sử dụng strategy pattern thì: 
             * muốn thay đổi discount hiện tại từ 80% xuống 50% thì sẽ phải thay đổi toàn bộ thằng đang 80% từ price*0.8
             * thành price*0.5 -> rất là mất công . thay vì thế chúng ta tạo ra một implement discount 50% và gọi chúng
             * hoặc là thay đổi trực tiếp implement 80% thành 50% -> những thằng đang 80% discount sẽ tự động ăn thành 50%
             */
            case 0:
                ticket.setiPromoteStrategy(new NoDiscountPromoteStrategy());
                break;
            case 1:
                ticket.setiPromoteStrategy(new HalfDiscountStrategy());
                break;
            case 2:
                ticket.setiPromoteStrategy(new QualifierDiscountStrategy());
                break;
            /**
             * Khi chúng ta muốn thêm một discount thì chỉ cần tạo thêm một impl EightyDiscountStrategy()
             * Rất đơn giản
             */
            default:
                ticket.setiPromoteStrategy(new EightyDiscountStrategy());
                break;
        }
    }
}
