package CreationalDesignPattern.SingletonDesignPattern;

public class Singleton {

    /**
     * Cách khởi tạo 1 : 
     * gán uniqueInstance = new Singleton();
     */
    // private static Singleton uniqueInstance = new Singleton();
    // public static Singleton getInstance() {
    //     return uniqueInstance;
    // }

    private static Singleton uniqueInstance;
    private Singleton() {

    }

    /**
     * Cách 2: 
     * Khởi tạo khi gọi getInstance lần đầu
     * @return uniqueInstance
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void saysHi() {
        System.out.println("Hello everyone, I am Viet");
    }
}
