package Comand.executable;

import Comand.utils.Creater;
import Objects.Organization;
import Objects.SendOdject;

import java.util.TreeMap;

public class Insert extends abstractComand implements ComandInterface{

    Creater creater = new Creater();
    public Insert(){
    }
    @Override
    public SendOdject execute(String[] args) {
        String key;
        try {
            key = args[1];
        }
        catch (IndexOutOfBoundsException e){
            key = "-1";
        }
        Organization org = creater.createOrganization();
        SendOdject so = new SendOdject();
        so.setComand("insert");
        so.setKey(key);
        so.setOrg(org);
        return so;
    }

}
