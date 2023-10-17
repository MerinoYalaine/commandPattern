package commandPattern;
public class Remote {
    private Command command;

    public Command getCommand(){

        return command;

    }

    public void setCommand(Command command){

        this.command = command;

    }

    public void clickButton(){

        System.out.println(command.execute());

    }

}
