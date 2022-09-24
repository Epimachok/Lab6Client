package Comand.executable;

import Objects.Organization;
import Objects.SendOdject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Print_unique_type extends abstractComand implements ComandInterface{

    public Print_unique_type(){
    }
    @Override
    public SendOdject execute(String[] args) {
        SendOdject so = new SendOdject();
        so.setComand("print_unique_type");
        return so;
    }

}
