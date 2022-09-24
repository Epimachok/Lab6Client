package Comand.executable;

import Objects.SendOdject;

/**
 * 
 */
public class Help extends abstractComand implements ComandInterface{

    public Help(){}

    @Override
    public SendOdject execute(String[] args) {
        SendOdject so = new SendOdject();
        so.setComand("help");
        return so;
    }

}
