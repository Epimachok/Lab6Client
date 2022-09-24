package Comand.executable;

import Objects.Organization;
import Objects.SendOdject;

import java.util.Set;
import java.util.TreeMap;

public class Max_by_creation_date extends abstractComand implements ComandInterface{
    public Max_by_creation_date(){
    }

    @Override
    public SendOdject execute(String[] args) {
        SendOdject so = new SendOdject();
        so.setComand("max_by_creation_date");
        return so;
    }

}
