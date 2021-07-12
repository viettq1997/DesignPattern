package CreationalDesignPattern.BuilderDesignPattern;

import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Engine;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.SeatBelt;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Windscreen;

public class Program {
    public static void main(String[] args) {
        // cach1:  tao contructor theo cach truyen thong
        Car car = new Car(4, new SeatBelt("viettq-seatbelt"), "red", new Windscreen("windscreen"), new Engine("engine"));
        System.out.println(car.toString());

        // cach2: dung builder tao contructor
        Car car2 = new CarBuilder()
                    .addNumberOfWheel(4)
                    .addColor("red")
                    .addEngine(new Engine("viettq-engine"))
                    .addSeatBelt(new SeatBelt("viettq-seatBelt"))
                    .addWindscreen(new Windscreen("viettq-windscreen"))
                    .build();
        System.out.println(car2.toString());
    }
}
