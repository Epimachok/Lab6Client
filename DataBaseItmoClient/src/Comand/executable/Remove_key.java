package Comand.executable;

import Objects.Organization;
import Objects.SendOdject;

import java.util.TreeMap;

public class Remove_key extends abstractComand implements ComandInterface{
    public Remove_key(){
    }
    @Override
    public SendOdject execute(String[] args) {
        String key;
        try {
            key = args[1];
            SendOdject so = new SendOdject();
            so.setComand("remove_key");
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
