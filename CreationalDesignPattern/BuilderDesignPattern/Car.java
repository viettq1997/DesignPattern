package CreationalDesignPattern.BuilderDesignPattern;

import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Engine;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.SeatBelt;
import CreationalDesignPattern.BuilderDesignPattern.CarPaths.Windscreen;

public class Car {
    private int numberOfWheel;
    private SeatBelt seatBelt;
    private String color;
    private Windscreen windscreen;
    private Engine engine;
    
    @Override
    public String toString() {
        String content = "";
        content += "numberOfWheel : " + this.numberOfWheel;
        content += "| seatBelt : " + this.seatBelt.getName();
        content += "| color : " + this.color;
        content += "| windscreen: " + this.windscreen.getName();
        content += "| engine: " + this.engine.getName();
        return content;
    }

    public Car(int numberOfWheel, SeatBelt seatBelt, String color, Windscreen windscreen, Engine engine) {
        this.numberOfWheel = numberOfWheel;
        this.seatBelt = seatBelt;
        this.color = color;
        this.windscreen = windscreen;
        this.engine = engine;
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
