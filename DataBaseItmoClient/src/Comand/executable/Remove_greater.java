package Comand.executable;

import Comand.utils.Creater;
import Objects.Organization;
import Objects.SendOdject;

import java.util.Set;

public class Remove_greater extends abstractComand implements  ComandInterface{
    Creater creater = new Creater();
    public Remove_greater(){
    }
    @Override
    public SendOdject execute(String[] args) {
        Organization org = creater.createOrganization();
        SendOdject so = new SendOdject();
        so.setComand("remove_greater");
        so.setOrg(org);
        return so;
    }


}
