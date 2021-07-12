package behaviorDesignPattern.CommandDesignPattern;

/**
 * Command
 */
public class TurnOffCommand implements ICommand {

    private final Fan fan;

    public TurnOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }
    
}
