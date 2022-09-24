package Comand.executable;

import Objects.SendOdject;

public class Exit extends abstractComand implements ComandInterface{
    public Exit(){}
    @Override
    public SendOdject execute(String[] args) {
        SendOdject x = new SendOdject();
        x.setComand("exit");
        x.setIsok(true);
        return x;
    }
}
