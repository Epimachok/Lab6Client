package Comand.utils;

public class ComandReader {
    public ComandReader(){}
    public String[] read(String com){
        String[] ComandDecoding = com.trim().split(" ");
        return ComandDecoding;
    }
}
