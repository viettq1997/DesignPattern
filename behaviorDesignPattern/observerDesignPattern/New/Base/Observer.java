package BehaviorDesignPattern.ObserverDesignPattern.New.Base;

public abstract class Observer {

    protected Subject subject;
    public abstract void Notify(Object arg);
    
    /**
     * Tại sao lại dùng abstract class ở đây ?
     * Vì muốn Observer trừu tượng nhất có thể
     * Và đóng gói nó lại không thay đổi gì nữa
     * Và những thằng notifier implement lại thằng Observer này thì phải implement
     * notify và những đặc thù phải có của Notify
     */
}
