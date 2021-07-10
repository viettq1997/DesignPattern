package CreationalDesignPattern.SingletonDesignPattern;

public class Program {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Singleton.getInstance().saysHi();

        Thread thread1 = new Thread(() -> Singleton.getInstance().saysHi());
        Thread thread2 = new Thread(() -> Singleton.getInstance().saysHi());

        thread1.start();
        thread2.start();
        
    }
}
