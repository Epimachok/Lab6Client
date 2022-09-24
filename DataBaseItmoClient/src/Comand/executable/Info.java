package Comand.executable;

import Objects.SendOdject;

import java.util.Collection;

public class Info extends abstractComand implements ComandInterface{

    public Info(){
    }

    @Override
    public SendOdject execute(String[] args) {
        SendOdject so = new SendOdject();
        so.setComand("info");
        return so;
    }

}
