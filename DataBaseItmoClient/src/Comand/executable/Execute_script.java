package Comand.executable;

import Objects.SendOdject;

public class Execute_script extends abstractComand implements ComandInterface{
    public Execute_script(){}
    String filename;
    @Override
    public SendOdject execute(String[] args) {
        SendOdject so = new SendOdject();
        so.setComand("execute_script");
        try {
            so.setScriptFile(args[1]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("You must enter filename.");
        }
        return so;
    }

}
