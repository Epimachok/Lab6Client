package Objects;

import java.io.Serializable;

public class Address implements Serializable {
    private static final long serialVersionUID = 3L;
    private String zipCode; //Поле не может быть null
    public Address(String zipCode){
        this.zipCode = zipCode;
    }
    @Override
    public String toString(){
        return "<officialAddress>" + "\n" + "<zipcode>" +zipCode+"</zipcode>" + "\n" + "</officialAddress>" + "\n";
    }

}