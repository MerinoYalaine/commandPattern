package commandPattern;

public class Lights implements Command{

    @Override
    public String execute() {
        return null;
    }

    public String switchOn(){

        return "\nLights are switched-on!";

}

    public String switchOff(){

        return "\nLights are switched-off!";

    }

    public String adjustUp(){

        return "\nIncreasing Brightness!";

    }

    public String adjustDown(){

        return "\nDecreasing Brightness!";

    }

    public String lightsRgb(){

        return "\nParty lights are on!";

    }

    @Override
    public String airconSwing(){
        return null;
    }



    @Override
    public String songShuffle(){
        return null;
    }

    @Override
    public String tvKaraoke(){
        return null;
    }

}
