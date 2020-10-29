package CommandPattern;

/**
 * Light Start Command where we are encapsulating both Object[light] and the
 * operation[turnOn] together as command. This is the essence of the command.
 *
 */
public class TurnOffLightCommand implements ICommand {
    Light light;

    public TurnOffLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
