package CreationalDesignPattern.SingletonDesignPattern;

import java.util.Random;

public class Singleton {

    /**
     * Cách khởi tạo 1 : 
     * gán uniqueInstance = new Singleton();
     */
    // private static Singleton uniqueInstance = new Singleton();
    // public static Singleton getInstance() {
    //     return uniqueInstance;
    // }


    /**
     * dùng thêm keyword: volatile để chắc cú hơn :
     * khi sử dụng instance của Singleton thì sẽ là sự dụng thằng update mới nhất của singleton
     */
    private static volatile Singleton uniqueInstance;
    private int index;
    private Singleton(int index) {
        this.index = index;
    }

    /**
     * Cách 2: 
     * Khởi tạo khi gọi getInstance lần đầu (Lazy loading)
     * Sử dụng synchronized để xử lý lỗi cho multiple threading
     * @return uniqueInstance
     */
    public synchronized static Singleton getInstance() {
        if (uniqueInstance == null) {
            Random random = new Random();
            uniqueInstance = new Singleton(random.nextInt(4));
        }
        return uniqueInstance;
    }

    public void saysHi() {
        System.out.println("Hello everyone, I am Viet" + index);
    }
}
