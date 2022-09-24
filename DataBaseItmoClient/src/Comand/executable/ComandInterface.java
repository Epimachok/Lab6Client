package Comand.executable;

import Objects.SendOdject;

import java.io.IOException;

public interface ComandInterface {
    public SendOdject execute(String[] args) throws IOException;
}
