package commandPattern;

public class Tv implements Command{

    @Override
    public String execute() {
        return null;
    }

    public String switchOn(){

        return "\nTv is switched-on!";

    }

    public String switchOff(){

        return "\nTv is switched-off!";

    }

    public String adjustUp(){

        return "\nNext Channel!";

    }

    public String adjustDown(){

        return "\nPrevious Channel!";

    }

    public String tvKaraoke(){

        return "\nKaraoke is on!";

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

}
