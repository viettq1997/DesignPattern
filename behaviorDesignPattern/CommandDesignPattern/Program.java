package behaviorDesignPattern.CommandDesignPattern;

public class Program {
    public static void main(String[] args) {
        Fan fan = new Fan();
        ICommand turnOnCommand = new TurnOnCommand(fan);
        ICommand turnOffCommand = new TurnOffCommand(fan);

        Remote remote = new Remote(turnOnCommand, turnOffCommand);

        remote.turnOnButtonClick();
        remote.turnOffButtonClick();
    }
}
