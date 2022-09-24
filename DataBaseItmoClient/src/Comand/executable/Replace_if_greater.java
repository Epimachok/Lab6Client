package Comand.executable;

import Comand.utils.Creater;
import Objects.Organization;
import Objects.SendOdject;

public class Replace_if_greater extends abstractComand implements ComandInterface{
    Creater creater = new Creater();
    public Replace_if_greater(){

    }
    @Override
    public SendOdject execute(String[] args) {
        String key;
        try {
            key = args[1];
            Organization org = creater.createOrganization();
            SendOdject so = new SendOdject();
            so.setComand("replace_if_greater");
            so.setOrg(org);
            so.setKey(key);
            return so;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Your must enter key!");
            SendOdject so = new SendOdject();
            so.setIsok(false);
            return so;
        }
    }

}
