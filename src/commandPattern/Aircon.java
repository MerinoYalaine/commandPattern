package commandPattern;

public class Aircon implements Command{

    @Override
    public String execute() {
        return null;
    }


    public String switchOn(){

        return "\nAircon is switch-on!";

    }

    public String switchOff(){

        return "\nAircon is switched-off!";

    }

    public String adjustUp(){

        return "\nIncreasing Temperature!";

    }

    public String adjustDown(){

        return "\nDecreasing Temperature!";

    }

    public String airconSwing(){

        return "\nAircon's swing is on!";

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
