package commandPattern;

public class MusicPlayer implements Command{

    @Override
    public String execute() {
        return null;
    }

    public String switchOn(){

        return "\nMusic Player are switched-on!";

    }

    public String switchOff(){

        return "\nMusic Player are switched-off!";

    }

    @Override
    public String adjustUp(){

        return "\nIncreasing Volume!";

    }

    @Override
    public String adjustDown(){

        return "\nDecreasing Volume!";

    }

    public String songShuffle(){

        return "\nSongs on shuffle!";

    }

    @Override
    public String tvKaraoke() {
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

}
