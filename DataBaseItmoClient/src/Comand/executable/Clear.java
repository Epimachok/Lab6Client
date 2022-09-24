package Comand.executable;

import Objects.Organization;
import Objects.SendOdject;

import java.util.TreeMap;

public class Clear extends abstractComand implements ComandInterface{
    public Clear(){}
    @Override
    public SendOdject execute(String[] args) {
        SendOdject so = new SendOdject();
        so.setComand("clear");
        return so;
    }
}
