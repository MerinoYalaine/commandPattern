package commandPattern;

public class Decrement implements Command{

    private Command command;

    public Decrement (Command command) {
        this.command = command;

    }

    @Override
    public String execute() {

        return command.adjustDown();

    }

    @Override
    public String switchOn() {
        return null;
    }

    @Override
    public String switchOff() {
        return null;
    }

    @Override
    public String adjustUp() {
        return null;
    }

    @Override
    public String adjustDown() {
        return null;
    }

    @Override
    public String airconSwing() {
        return null;
    }

    @Override
    public String lightsRgb() {
        return null;
    }

    @Override
    public String songShuffle() {
        return null;
    }

    @Override
    public String tvKaraoke() {
        return null;
    }

}

