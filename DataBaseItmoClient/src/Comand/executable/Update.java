package Comand.executable;

import Comand.utils.Creater;
import Objects.Organization;
import Objects.SendOdject;

import java.io.IOException;
import java.util.Set;

public class Update extends abstractComand implements ComandInterface{
    Creater creater = new Creater();
    public Update(){
    }
    @Override
    public SendOdject execute(String[] args) throws IOException {
        long id;
        try {
            id = Long.parseLong(args[1]);
            Organization org = creater.createOrganization();
            SendOdject so = new SendOdject();
            so.setComand("update");
            so.setId(id);
            so.setOrg(org);
            return so;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Your must enter id!");
            SendOdject so = new SendOdject();
            so.setIsok(false);
            return so;
        }
    }

}
