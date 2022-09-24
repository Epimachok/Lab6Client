package Comand.executable;

import Objects.SendOdject;

import java.io.IOException;

public abstract class abstractComand implements ComandInterface{
    @Override
    public SendOdject execute(String[] args) throws IOException {
        return new SendOdject();
    }

}
