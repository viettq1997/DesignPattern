package behaviorDesignPattern.CommandDesignPattern;

/**
 * Command
 */
public class TurnOnCommand implements ICommand {

    private final Fan fan;

    public TurnOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
    
}
