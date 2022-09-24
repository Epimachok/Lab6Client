package Comand.executable;

import Objects.SendOdject;

import java.util.Set;

public class Remove_all_by_employees_count extends abstractComand implements ComandInterface{
    public Remove_all_by_employees_count(){
    }
    @Override
    public SendOdject execute(String[] args) {
        try {
            long x = Long.parseLong(args[1]);
            SendOdject so = new SendOdject();
            so.setComand("remove_all_by_employees_count");
            so.setEmployeesCount(x);
            return so;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your must enter employees_count!");
            SendOdject so = new SendOdject();
            so.setIsok(false);
            return so;
        }
    }

}
