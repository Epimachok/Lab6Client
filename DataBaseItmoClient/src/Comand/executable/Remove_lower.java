package Comand.executable;

import Comand.utils.Creater;
import Objects.Organization;
import Objects.SendOdject;

import java.util.Set;

public class Remove_lower extends abstractComand implements ComandInterface{

    Creater creater = new Creater();
   public Remove_lower(){
    }
    @Override
    public SendOdject execute(String[] args) {
        Organization org = creater.createOrganization();
        SendOdject so = new SendOdject();
        so.setComand("remove_lower");
        so.setOrg(org);
        return so;
    }

}
