package Comand.executable;

import Objects.SendOdject;

import java.io.IOException;
import java.util.Set;

public class Show extends abstractComand implements ComandInterface{

    public Show(){
    }
    @Override
    public SendOdject execute(String[] args) throws IOException {
        SendOdject so = new SendOdject();
        so.setComand("show");
        return so;
    }


}
