package Objects;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private static final long serialVersionUID = 4L;
    private float x;
    private float y;
    public Coordinates(float x, float y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "<coordinates>"+"\n" + "<x>" + String.valueOf(x) + "</x>" +"\n" + "<y>" +String.valueOf(y)+"</y>"+"\n"+"</coordinates>" + "\n";
    }
}

