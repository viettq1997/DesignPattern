package CreationalDesignPattern.BuilderDesignPattern;

import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Engine;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.SeatBelt;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Windscreen;

public class CarBuilder implements ICarBuilder {
    private int numberOfWheel;
    private SeatBelt seatBelt;
    private String color;
    private Windscreen windscreen;
    private Engine engine;

    @Override
    public CarBuilder addNumberOfWheel(int _numberOfWheel) {
        numberOfWheel = _numberOfWheel;
        return this;
    }
    @Override
    public CarBuilder addSeatBelt(SeatBelt _seatBelt) {
        seatBelt = _seatBelt;
        return this;
    }
    @Override
    public CarBuilder addColor(String _color) {
        color = _color;
        return this;
    }
    @Override
    public CarBuilder addWindscreen(Windscreen _windscreen) {
        windscreen = _windscreen;
        return this;
    }
    @Override
    public CarBuilder addEngine(Engine _engine) {
        engine = _engine;
        return this;
    }

    @Override
    public Car build() {
        return new Car(numberOfWheel, seatBelt, color, windscreen, engine);
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }
    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }
    public SeatBelt getSeatBelt() {
        return seatBelt;
    }
    public void setSeatBelt(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Windscreen getWindscreen() {
        return windscreen;
    }
    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
