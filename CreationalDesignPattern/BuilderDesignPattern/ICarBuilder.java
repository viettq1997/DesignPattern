package CreationalDesignPattern.BuilderDesignPattern;

import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Engine;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.SeatBelt;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Windscreen;

public interface ICarBuilder {
    CarBuilder addNumberOfWheel(int numberOfWheel);
    CarBuilder addSeatBelt(SeatBelt seatBelt);
    CarBuilder addColor(String color);
    CarBuilder addWindscreen(Windscreen windscreen);
    CarBuilder addEngine(Engine engine);

    Car build();
}
