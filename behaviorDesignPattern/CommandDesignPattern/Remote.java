package behaviorDesignPattern.CommandDesignPattern;

/**
 * Commander
 */
public class Remote {
    private final ICommand turnOnCommand;
    private final ICommand turnOffCommand;

    public Remote(ICommand turnOnCommand, ICommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void turnOnButtonClick() {
        turnOnCommand.execute();
    }

    public void turnOffButtonClick() {
        turnOffCommand.execute();
    }
}
